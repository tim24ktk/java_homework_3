package java_homework_3;

public class Program {
  static int countPaths(int x, int y, int N) {
    if (x == N -1 && y == N-1) {
      return 1;
    }

    if (x > N -1 || y > N - 1) {
      return 0;
    }

    return countPaths(x + 1, y, N) + countPaths(x, y + 1, N);
  }

  public static void main(String[] args) {
    System.out.println(countPaths(1, 1, 8));
  }
}
