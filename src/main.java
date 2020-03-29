import java.util.Random;

public class main {

	public static void questionOne() {

		int[][] array = new int[5][5];

		for (int i = 1; i < array.length; i++) {
			for (int j = 1; j < array[0].length; j++) {
				Random random = new Random();
				int number = random.nextInt(2);
				array[i][j] = number;
				System.out.print(array[i][j] + "  ");
			}
			System.out.println("  ");

		}

		int[][] newArray = new int[array.length - 1][array[0].length - 1];

		for (int i = 1; i < array.length - 1; i++) {
			for (int j = 1; j < array[0].length - 1; j++) {

				int count = 0;

				for (int k = -1; k < 2; k++) {
					for (int n = -1; n < 2; n++) {
						count += array[i + k][j + n];
					}
				}
				

				count = count - array[i][j];

				if (((array[i][j] == 1) && (count < 2)) || ((array[i][j] == 1) && (count > 3))) {
					newArray[i][j] = 0;
				} else if ((array[i][j] == 0) && (count == 3)) {
					newArray[i][j] = 1;
				} else {
					newArray[i][j] = array[i][j];
				}

			}

		}

		System.out.println("--new version of array--");

		for (int i = 0; i < newArray.length; i++) {
			for (int j = 0; j < newArray[0].length; j++) {
				System.out.print(newArray[i][j] + "  ");
			}
			System.out.println();

		}

	}

	public static void questionTwo() {
		int[][] dizi = new int[][] { { 1, 2, 3, 4, 5 }, { 16, 17, 18, 19, 6 }, { 15, 24, 25, 20, 7 },
				{ 14, 23, 22, 21, 8 }, { 13, 12, 11, 10, 9 },

		};

		int[] tempArray = new int[dizi.length * dizi[0].length];
		int t = 0;

		for (int i = 0; i < dizi.length; i++) {
			for (int j = 0; j < dizi[0].length; j++) {

				tempArray[t] = dizi[i][j];
				t++;

				System.out.print(dizi[i][j] + "  ");
			}
			System.out.println();
		}
		for (int i = 0; i < tempArray.length; i++) {
			int min = tempArray[i];
			int minC = i;
			for (int j = i + 1; j < tempArray.length; j++) {
				if (tempArray[j] < min) {
					min = tempArray[j];
					minC = j;
				}
			}
			// swapping
			int temp = tempArray[i];
			tempArray[i] = min;
			tempArray[minC] = temp;
		}

		for (int i = 0; i < tempArray.length - 1; i++) {

			System.out.print(tempArray[i] + "  ");

		}
	}

	public static void questionThree() {

		// Random matris olcak MxN seklýnde m ve n de random oluyor.
		Random random = new Random();

		System.out.println("birinciMatris is : ");

		int rn = random.nextInt(10) + 1;

		int rn3 = random.nextInt(10) + 1;

		int[][] birinciMatris = new int[rn3][rn];

		for (int i = 1; i < birinciMatris.length; i++) {

			for (int j = 1; j < birinciMatris[0].length; j++) {

				int number = random.nextInt(11);

				birinciMatris[i][j] = number;
				System.out.print(birinciMatris[i][j] + "  ");
			}
			System.out.println("  ");

		}
		System.out.println("  ");

		System.out.println("ikinciMatris is : ");

		int rn2 = random.nextInt(10) + 1;

		int[][] ikinciMatris = new int[birinciMatris[0].length][rn2];

		for (int i = 1; i < ikinciMatris.length; i++) {

			for (int j = 1; j < ikinciMatris[0].length; j++) {

				int number = random.nextInt(11);

				ikinciMatris[i][j] = number;

				System.out.print(ikinciMatris[i][j] + "  ");
			}
			System.out.println("  ");
		}

		System.out.println("");

		int[][] carpýmMatrisi = new int[birinciMatris.length][ikinciMatris[0].length];

		for (int i = 0; i < birinciMatris.length; i++) {

			for (int j = 0; j < ikinciMatris[0].length; j++) {

				for (int z = 0; z < ikinciMatris.length; z++) {

					carpýmMatrisi[i][j] += birinciMatris[i][z] * ikinciMatris[z][j];

				}
			}
		}

		System.out.println("Matris carpýlmarý : ");

		for (int i = 1; i < carpýmMatrisi.length; i++) {

			for (int j = 1; j < carpýmMatrisi[0].length; j++) {

				System.out.print(carpýmMatrisi[i][j] + "  ");
			}
			System.out.println("  ");
		}

	}

	public static void questionFour() {

		int[] dizi = new int[10];

		for (int i = 0; i < dizi.length; i++) {

			Random random = new Random();
			int number = random.nextInt(101);
			dizi[i] = number;

		}

		for (int i = 0; i < dizi.length; i++) {

			System.out.print(dizi[i] + " ");

		}

		for (int i = 0; i < dizi.length; i++) {

			for (int j = i + 1; j < dizi.length; j++) {

				if (dizi[i] == dizi[j]) {

					System.out.print(dizi[j] + ",");

				}
			}

		}

	}

	public static void main(String[] args) {

		// questionOne();
		// questionTwo();
		//questionThree();
		// questionFour();

	}

}
