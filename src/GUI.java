import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {
    public JFrame window;
    public JTextArea textArea;
    public JPanel viewPanel;
    public JScrollPane scrollPane;
    public JMenuBar menuBar;
    public JMenu menuFile;
    public JMenuItem newItem, openItem, saveItem, saveAsItem, exitItem;

    MVC file = new MVC(this);

    public static void main(String[] args) {
        new GUI();
    }

    public GUI() {
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
        newItem.addActionListener(this);
        newItem.setActionCommand("New");
        menuFile.add(newItem);

        openItem = new JMenuItem("Open");
        openItem.addActionListener(this);
        openItem.setActionCommand("Open");
        menuFile.add(openItem);

        saveItem = new JMenuItem("Save");
        saveItem.addActionListener(this);
        saveItem.setActionCommand("Save");
        menuFile.add(saveItem);

        saveAsItem = new JMenuItem("Save As");
        saveAsItem.addActionListener(this);
        saveAsItem.setActionCommand("SaveAs");
        menuFile.add(saveAsItem);

        exitItem = new JMenuItem("Exit");
        exitItem.addActionListener(this);
        exitItem.setActionCommand("Exit");
        menuFile.add(saveAsItem);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        String command = actionEvent.getActionCommand();

        switch(command) {
            case "New": file.newFile(); break;
            case "Open": file.open(); break;
            case "Save": file.save(); break;
            case "SaveAs": file.saveAs(); break;
        }
    }
}



