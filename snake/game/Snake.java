package snake.game;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Snake {

	private char[][] borad = null;
	Queue<Node> que = new LinkedList<>();

	public Snake(int row, int col) {
		this.borad = new char[row][col];
		this.que.add(new Node(0, 0));
		borad[0][3] = 'X';
		borad[1][5] = 'X';
		borad[2][2] = 'X';
		borad[3][4] = 'X';
		borad[4][1] = 'X';
		borad[5][0] = 'X';
	}

	public void snakeMove(int row, int col) {
		if (row >= 0 && row < borad.length && col >= 0 && col < borad.length) {
			
			if (borad[row][col] == '*') {
				System.out.println("Game Over...!");
				System.exit(0);
			}
			que.add(new Node(row, col));

			if (borad[row][col] != 'X') {
				Node node = que.poll();
				int r = node.getRow();
				int c = node.getColumn();
				borad[r][c] = '\0';
			}

			borad[row][col] = '*';

			while (!que.isEmpty()) {
				printSnake();
				Scanner sc = new Scanner(System.in);
				System.out.print("Enter a Position r/d/l/u : ");
				char direction = sc.next().toLowerCase().charAt(0);

				if (direction == 'r') {
					snakeMove(row, ++col);
				}
				if (direction == 'd') {
					snakeMove(++row, col);
				}
				if (direction == 'l') {
					snakeMove(row, --col);
				}
				if (direction == 'u') {
					snakeMove(--row, col);
				}
			}
		} else {
			System.out.println("Invaild Move");
			System.exit(0);
		}
	}

	public void printSnake() {
		for (int i = 0; i < borad.length; i++) {
			for (int j = 0; j < borad[i].length; j++) {
				System.out.print(borad[i][j] + " ");
			}
			System.out.println();
		}
	}

}
