import java.util.Scanner;

public class Battleship {
	public static void main(String[] args) {
        System.out.println("Welcome to Battleship!\n");

		// board:
		// [[-, -, -, -, -],
		// [-, @, -, -, -],
		// [-, -, @, -, -],
		// [-, -, -, @, -],
		// [-, -, -, @, @]]
		int[][] player1Coords = enterCoordinates(1);
		char[][] player1Board = convertToInitBoard(player1Coords);
		printBattleShip(player1Board); // Print player 1's initial board

		for (int i = 0; i < 100; i++) {
			System.out.print("\n");
		}

		int[][] player2Coords = enterCoordinates(2);
		char[][] player2Board = convertToInitBoard(player2Coords);
		printBattleShip(player2Board); // Print player 2's initial board

		for (int i = 0; i < 100; i++) {
			System.out.print("\n");
		}

		char[][] targetBoard1 = emptyBoardBuilder();
		char[][] targetBoard2 = emptyBoardBuilder();

		int current = 1;
		int player1Hits = 0;
		int player2Hits = 0;
		boolean allShipsSunk = false;

		do {
			System.out.println("Player " + current + ", enter hit row/column:");
			Scanner input = new Scanner(System.in);
			int inputRow = input.nextInt();
			int inputCol = input.nextInt();

			if ((inputRow > 4 || inputRow < 0) || (inputCol > 4 || inputCol < 0)) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
				continue; // restarts do while
			}

			// Player 1's move
			if (current == 1) { // if it's player 1's turn, we need to check against player 2's board
				if (targetBoard2[inputRow][inputCol] == 79 || targetBoard2[inputRow][inputCol] == 88) { // if input hits either X or O on TARGET board
					System.out.println("You already fired on this spot. Choose different coordinates.");
					continue; // restarts do while
				}

				if (player2Board[inputRow][inputCol] == 45) { // if inputted coordinates hit empty spot
					targetBoard2[inputRow][inputCol] = 79; // 79 = "O"; meaning missed hit
					System.out.println("PLAYER 1 MISSED!");
					printBattleShip(targetBoard2);
					System.out.print("\n");
				} else if (player2Board[inputRow][inputCol] == 64) { // if inputted coordinates hit ship (@)
					targetBoard2[inputRow][inputCol] = 88; // 88 = "X"; meaning hit ship
					player1Hits++;
					System.out.println("PLAYER 1 HIT PLAYER 2's SHIP!");
					printBattleShip(targetBoard2);
					if (player1Hits < 5){
						System.out.print("\n");
					}
				}

			} else { // Player 2's move
				 if (targetBoard1[inputRow][inputCol] == 79 || targetBoard1[inputRow][inputCol] == 88) {
					System.out.println("You already fired on this spot. Choose different coordinates.");
					continue;
				}

				if (player1Board[inputRow][inputCol] == 45) {
					targetBoard1[inputRow][inputCol] = 79; // miss
					System.out.println("PLAYER 2 MISSED!");
					printBattleShip(targetBoard1);
					System.out.print("\n");
				} else if (player1Board[inputRow][inputCol] == 64) {
					targetBoard1[inputRow][inputCol] = 88; // hit
					player2Hits++;
					System.out.println("PLAYER 2 HIT PLAYER 1's SHIP!");
					printBattleShip(targetBoard1);
					if (player2Hits < 5) {
						System.out.print("\n");
					}
				}
			}

			if (player1Hits == 5) {
				allShipsSunk = true;
				System.out.println("PLAYER 1 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!\n");
			} else if (player2Hits == 5) {
				allShipsSunk = true;
				System.out.println("PLAYER 2 WINS! YOU SUNK ALL OF YOUR OPPONENT'S SHIPS!\n");
			}

			current = (current == 1) ? 2 : 1; // alternate to other player
		} while (!allShipsSunk);

		System.out.println("Final boards:\n");

		// 64 = @
		// 88 = X
		// 45 = -
		// 79 = O
		for (int row = 0; row < 5; row++) { // iterate over all elements, row wise
			for (int col = 0; col < 5; col++) {
				if (player1Board[row][col] == 64 && targetBoard1[row][col] == 45) {
					targetBoard1[row][col] = 64;
				}
			}
		}
		printBattleShip(targetBoard1);

		System.out.print("\n");

		for (int row = 0; row < 5; row++) { // iterate over all elements, row wise
			for (int col = 0; col < 5; col++) {
				if (player2Board[row][col] == 64 && targetBoard2[row][col] == 45) {
					targetBoard2[row][col] = 64;
				}
			}
		}
		printBattleShip(targetBoard2);
	}




	// Method to create empty 5x5 matrix with just `-` values
	public static char[][] emptyBoardBuilder() {
		char[][] emptyBoard = new char[5][5];

		for (int row = 0; row < 5; row++) {
			for (int col = 0; col < 5; col++) {
				emptyBoard[row][col] = 45; // 45 is the ascii val for `-`
			}
		}
		return emptyBoard;
	}


	// inputCoords:
	// [[1, 1],
	// [2, 2],
	// [3, 3],
	// [4, 4],
	// [5, 5]]
	public static char[][] convertToInitBoard(int[][] inputCoords) {
//		// Init empty 5x5 matrix
//		char[][] board = new char[5][5];
//		// Create the initial 5x5 matrix with `-` chars for all values
//		for (int row = 0; row < 5; row++) {
//			for (int col = 0; col < 5; col++) {
//				board[row][col] = 45; // 45 is the ascii val for `-`
//			}
//		}

		char[][] board = emptyBoardBuilder();

		// Iterate over all inputted coordinates
		for (int[] coord : inputCoords) {
			int inputRow = coord[0]; // first val in current coordinate (row)
			int inputCol = coord[1]; // second val in current coordinate (col)

			board[inputRow][inputCol] = 64; // all values start with `@` (ascii 65)
		}
		return board;
	}


	// Method to convert coordinates into 5x2 matrix
	public static int[][] enterCoordinates(int player) {
		// Create scanner object for player inputs
		Scanner input = new Scanner(System.in);

		System.out.println("PLAYER " + player + ", ENTER YOUR SHIPS' COORDINATES.");
		// Init array of ship locations for current player
			// 5 rows 2 cols, meaning 5 pairs of coordinates
		int[][] coordinates = new int[5][2];

		// Init coordinate index in array (starting from zero):
		int ship = 0;

		do {
			System.out.println("Enter ship " + (ship + 1) + " location:");
			int inputRow = input.nextInt();
			int inputCol = input.nextInt();
			int [] inputCoordinate = {inputRow, inputCol};

			// if either val is out of bounds, tell user input is invalid, then terminate current iteration
			if ((inputRow > 4 || inputRow < 0) || (inputCol > 4 || inputCol < 0)) {
				System.out.println("Invalid coordinates. Choose different coordinates.");
				continue; // pertains to the nearest loop, which is the while loop here; everything below gets skipped and the do begins again
			}

			// init bool indicator for whether duplicate was found
			boolean duplicateExists = false;
			for (int row = 0; row < ship; row++) { // iterate over only the newly inputted values
				int arrayRow = coordinates[row][0]; // row val for current coordinate element
				int arrayCol = coordinates[row][1]; // col val for current coordinate element
				if (arrayRow == inputRow && arrayCol == inputCol) { // if inputted row&col match any of the already inputted coordinates
					System.out.println("You already have a ship there. Choose different coordinates.");
					duplicateExists = true;
				}
			}

			if (!duplicateExists) {
				coordinates[ship] = inputCoordinate;
				ship++;
			}
		} while (ship < 5);
		return coordinates;
	}



	// Use this method to print game boards to the console.
	private static void printBattleShip(char[][] player) {
		System.out.print("  ");
		for (int row = -1; row < 5; row++) {
			if (row > -1) {
				System.out.print(row + " ");
			}
			for (int column = 0; column < 5; column++) {
				if (row == -1) {
					System.out.print(column + " ");
				} else {
					System.out.print(player[row][column] + " ");
				}
			}
			System.out.println("");
		}
	}
}