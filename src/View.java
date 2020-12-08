import javax.swing.*;

public class View {
    private JFrame window;
    private JTextArea textArea;
    private JPanel viewPanel;
    private JScrollPane scrollPane;
    private JMenuBar menuBar;
    private JMenu menuFile;
    private JMenuItem newItem, openItem, saveItem, saveAsItem;

    public static void main(String[] args) {
        new View();
    }

    public View() {
        createWindow();
        createTextArea();
        createMenuBar();
        createFileMenu();
        window.setVisible(true);
    }

    public void createWindow() {
        window = new JFrame("Notepad");
        window.setSize(800,600);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createTextArea() {
        textArea = new JTextArea();

        scrollPane = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setBorder(BorderFactory.createEmptyBorder());
        window.add(scrollPane);
    }

    public void createMenuBar() {
        menuBar = new JMenuBar();
        window.setJMenuBar(menuBar);

        menuFile = new JMenu("File");
        menuBar.add(menuFile);
    }

    public void createFileMenu() {

        newItem = new JMenuItem("New");
        menuFile.add(newItem);

        openItem = new JMenuItem("Open");
        menuFile.add(newItem);

        saveItem = new JMenuItem("Save");
        menuFile.add(saveItem);

        saveAsItem = new JMenuItem("Save As");
        menuFile.add(saveAsItem);

    }

}



