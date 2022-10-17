package counter;

public class SwitchLoop {
    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            switch (i) {
                case 5:
                    break;
                case 4:
                    i--;
                    break;
                case 3:
                    ++i;
                    break;
                case 2:
                    --i;
                case 1:
                    --i;
            }

            System.out.println(i);
        }
    }
}

// 5, 3, 4, 2, 1, 0
// 5, 3, 0
