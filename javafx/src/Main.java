import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Exemplo Swing");
        JButton button = new JButton("Clique aqui");
        JButton button1 = new JButton("Ver lista");
        List<Pessoa> list = new ArrayList<>();

        janela.setSize(600,500);
        janela.setLayout(null);


        JLabel label = new JLabel("Nome");
        label.setBounds(20,20,150,40);

        JTextField input = new JTextField();
        input.setBounds(20,50,150,40);



        JLabel label1 = new JLabel("Email");
        label1.setBounds(220,20,150,40);

        JTextField input1 = new JTextField();
        input1.setBounds(220,50,150,40);


        JLabel label2 = new JLabel("Telefone");
        label2.setBounds(20,90,150,40);

        JTextField input2 = new JTextField();
        input2.setBounds(20,120,150,40);


        button.setBounds(20,200,150,40);
        button.addActionListener(e -> {
            String nome = input.getText();
            String email = input1.getText();
            String telefone = input2.getText();

            list.add(new Pessoa(nome, email, telefone));

            JOptionPane.showMessageDialog(null,"dados salvo com sucesso!");
        });

        button1.setBounds(20,250,150,40);
        button1.addActionListener(actionEvent -> {
            JOptionPane.showMessageDialog(null,list);
        });

        janela.add(label);
        janela.add(input);




        janela.add(label1);
        janela.add(input1);

        janela.add(label2);
        janela.add(input2);

        janela.add(button);
        janela.add(button1);




        janela.setVisible(true);

    }
}