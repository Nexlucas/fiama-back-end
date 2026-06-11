import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        JFrame janela = new JFrame(); //o jfreme e usadp para criar uma tela
        List<Produto> list = new ArrayList<>();

        janela.setSize(600,500); // aqui e o tamanho da tela
        janela.setLayout(null);

        JButton button1 = new JButton("Cadastrar");     //JButton e usado para criar um botao
        button1.setBounds(40,240,200,40); // aqui eu escolho a posição e o tamanho do botão


        JButton button2 = new JButton("Limpar");
        button2.setBounds(300,240,200,40);


        JLabel label1 = new JLabel("Nome");             // Jlabel e usado pra mostrar texto
        label1.setBounds(40,50,200,40);   // aqui to escolhendo o tamanho e posisão do Jlabel
        JTextField input1 = new JTextField();               // JTextField ele  cria um campo que você pode digitar
        input1.setBounds(40,80,200,40);

        JLabel label2 = new JLabel("Preço");
        label2.setBounds(300,50,200,40);
        JTextField input2 = new JTextField();
        input2.setBounds(300,80,200,40);

        JLabel label3 = new JLabel("Quantidade");
        label3.setBounds(40,130,400,40);
        JTextField input3 = new JTextField();
        input3.setBounds(40,160,460,40);

        button1.addActionListener(actionEvent -> {   // addActionListener e para da uma ação pro botao quando é apertado
            String nome = input1.getText();
            double pre = Double.parseDouble(input2.getText());
            int quan = Integer.parseInt(input3.getText());

            double valor = pre * quan;                          // a variavel valor pega o preço e multplica pela quantidade

            list.add(new Produto(nome,pre,quan,valor));

            if (pre <= 0 || quan <= 0){
                JOptionPane.showMessageDialog(null,"Preço e quantidade devem ser maiores que zero."); //os if estao vendo se o input está vazio e se os numeros é maior que 0
            }else {
                if (input1.getText().isEmpty() || input2.getText().isEmpty() || input3.getText().isEmpty()){
                    JOptionPane.showMessageDialog(null,"Preencha todos os campos.");
                }else {
                    JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!" + list);

                }
            }



        });
        button2.addActionListener(actionEvent -> {
            input1.setText("");
            input2.setText("");
            input3.setText("");
        });

        janela.add(label1);     // janela.add(); está adicionando o elemento na tela
        janela.add(input1);
        janela.add(label2);
        janela.add(input2);
        janela.add(label3);
        janela.add(input3);
        janela.add(button1);
        janela.add(button2);

        janela.setVisible(true); // janela.setVisible(true) deixa a tela visivel
    }
}
