import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.SwingUtilities;

public class View extends JFrame implements ActionListener {
    AddressBook model;
    JList<BuddyInfo> viewList;
    public View(AddressBook m){
        model = m;
        viewList = new JList<>(model.getListAddressBook());
        add(viewList);
        viewList.setVisible(false);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("JList Example");
        this.setSize(400,200);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

        JMenuBar menuBar = new JMenuBar();
        JMenu actions = new JMenu("Actions");
        menuBar.add(actions);

        JMenuItem create = new JMenuItem("Create");
        JMenuItem display = new JMenuItem("Display");
        JMenuItem add = new JMenuItem("Add");
        JMenuItem remove = new JMenuItem("Remove");

        actions.add(create);
        actions.add(display);
        actions.add(add);
        actions.add(remove);
        this.setJMenuBar(menuBar);

        create.addActionListener(this);
        create.setActionCommand("Create");
        display.addActionListener(this);
        display.setActionCommand("Display");
        add.addActionListener(this);
        add.setActionCommand("Add");
        remove.addActionListener(this);
        remove.setActionCommand("Remove");

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals(("Display"))){
            if (viewList.isVisible() == true){
                viewList.setVisible(false);
            }
            else{
                viewList.setVisible(true);
            }
        }
        else if (e.getActionCommand().equals("Add")) {
                JOptionPane optionPane = new JOptionPane();
                String name = JOptionPane.showInputDialog("Enter Name:");
                String address = JOptionPane.showInputDialog("Enter Address:");
                String phone = JOptionPane.showInputDialog("Enter Phone:");
                model.addBuddy(new BuddyInfo(name, address, phone));
        }
        else if (e.getActionCommand().equals("Remove")) {
            JOptionPane optionPane = new JOptionPane();
            String name = JOptionPane.showInputDialog("Enter Name:");
            String address = JOptionPane.showInputDialog("Enter Address:");
            String phone = JOptionPane.showInputDialog("Enter Phone:");
            model.removeBuddy(new BuddyInfo(name, address, phone));
        }
        else {
            ;
        }
    }
}
