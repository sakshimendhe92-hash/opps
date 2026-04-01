import java.util.Scanner;

class FileExtensionExtractor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String file = sc.nextLine();

        int index = file.lastIndexOf(".");

        if (index != -1) {
            String ext = file.substring(index + 1);
            System.out.println("Extension: " + ext);
        } else {
            System.out.println("No extension found");
        }
    }
}