import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class playerlist {
    // Объявления графических компонентов
    private JFrame playerList;
    private DefaultTableModel model;
    private JButton save, print, add, delete;
    private JToolBar toolBar;
    private JScrollPane scroll;
    private JTable players;
    private JComboBox player;
    private JTextField playerName;
    private JButton filter;
    public void show() {
        // Создание окна
        playerList = new JFrame("Player list");
        playerList.setSize(600, 400);
        playerList.setLocation(1200, 200);
        playerList.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Создание кнопок и прикрепление иконок
        save = new JButton(new ImageIcon("save.png"));
        add = new JButton(new ImageIcon("add.png"));
        delete = new JButton(new ImageIcon("delete.png"));
        print = new JButton(new ImageIcon("print.png"));

        // Настройка подсказок для кнопок
        save.setToolTipText("Save");
        add.setToolTipText("Add player");
        delete.setToolTipText("Delete player");
        print.setToolTipText("Print");

        // Добавление кнопок на панель инструментов
        toolBar = new JToolBar("Toolbar");
        toolBar.add(save);
        toolBar.add(add);
        toolBar.add(delete);
        toolBar.add(print);

        // Размещение панели инструментов
        playerList.setLayout(new BorderLayout());
        playerList.add(toolBar, BorderLayout.NORTH);

        // Создание таблицы с данными
        String [] columns = {"Player", "Player number", "Player position", "Country"};
        String [][] data = {{"Marquinhos", "5", "Defender", "Brazil"},
                {"Donnarumma", "1", "Goalkeeper", "Italy"}};
        model=  new DefaultTableModel(data, columns);
        players = new JTable(model);
        scroll = new JScrollPane(players);

        // Размещение таблицы с данными
        playerList.add(scroll, BorderLayout.CENTER);

        // Подготовка компонентов поиска
        player = new JComboBox(new String[]{"Player", "Marquinhos", "Donnarumma"});
        playerName = new JTextField("Player name");
        filter = new JButton("Search");
        // Добавление компонентов на панель
        JPanel filterPanel = new JPanel();
        filterPanel.add(player);
        filterPanel.add(playerName);
        filterPanel.add(filter);

        // Размещение  панели поиска внизу окна
        playerList.add(filterPanel, BorderLayout.SOUTH);

        // Визуализация экранной формы
        players.setBackground(new Color(150, 200, 100));
        playerList.setVisible(true);
    }

    public static void main(String[] args) {
        // Создание и отображение экранной формы
        new playerlist().show();
    }
}
