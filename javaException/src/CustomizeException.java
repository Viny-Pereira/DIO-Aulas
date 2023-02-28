import javax.swing.*;
import java.io.*;

public class CustomizeException {
    public static void main(String[] args) {
        String fileName = JOptionPane.showInputDialog("Nome do arquivo a ser exibido: ");

        printFileConsole(fileName);
        System.out.println("\nCom exception ou não, o programa continua...");
    }

    public static void printFileConsole(String filaName) {

        try {
            BufferedReader br = readFile(filaName);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);
            bw.flush();
            br.close();

        } catch (ImpossibleOpenFileException e) {
            JOptionPane.showMessageDialog(null,
                    e.getMessage());
            // e.printStackTrace();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null,
                    "Ocorreu um erro não esperado, por favor, fale com o suporte." + ex.getMessage());
            ex.printStackTrace();
        }
    }

    public static BufferedReader readFile(String filaName) throws ImpossibleOpenFileException {

        File file = new File(filaName);
        try {
            return new BufferedReader(new FileReader(filaName));
        } catch (FileNotFoundException e) {
            throw new ImpossibleOpenFileException(file.getName(), file.getPath());
        }
    }
}

class ImpossibleOpenFileException extends Exception {

    private String filaName;
    private String directory;

    public ImpossibleOpenFileException(String filaName, String directory) {
        super("O arquivo " + filaName + " não foi encontrado no diretório " + directory);
        this.filaName = filaName;
        this.directory = directory;
    }

    /*
     * @Override
     * public String toString() {
     * return "ImpossibleOpenFileException{" +
     * "filaName='" + filaName + '\'' +
     * ", directory='" + directory + '\'' +
     * '}';
     * }
     */
}
