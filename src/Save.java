import java.awt.*;

public class Save {

    GUI gui;

    public void save() {

    }

    public void saveAs() {

        FileDialog fd = new FileDialog(gui.window, "Save", FileDialog.SAVE);
        fd.setVisible(true);

        if(fd.getFile()!=null) {

        }
    }
}
