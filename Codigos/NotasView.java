package Codigos;

import java.awt.*;
import javax.swing.*;

public class NotasView {
    public NotasView() {
        JFrame janela = new JFrame("Calculadora de notas escolar");

        janela.setSize(500, 300);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setLocationRelativeTo(null);
        
        // Criando os componentes da interface
        JPanel painel = new JPanel();
        JLabel escMedia = new JLabel("Média da sua escola: ");
        JTextField campoMedia = new JTextField();
        JLabel labelNota1 = new JLabel("Primeiro Bimestre: ");
        JTextField campo1 = new JTextField();
        JLabel labelNota2 = new JLabel("Segundo Bimestre: ");
        JTextField campo2 = new JTextField();
        JLabel labelNota3 = new JLabel("Terceiro Bimestre: ");
        JTextField campo3 = new JTextField();
        JLabel labelNota4 = new JLabel("Quarto Bimestre: ");
        JTextField campo4 = new JTextField();
        JButton botaoEnviar = new JButton("Calcular");
        JTextField campoResultado = new JTextField();
        painel.setLayout(new GridLayout(7, 2, 10, 10));
        campoResultado.setEditable(false);

        //estilizando os componentes
        botaoEnviar.setBackground(Color.BLUE);
        botaoEnviar.setForeground(Color.WHITE);
        labelNota1.setForeground(Color.BLACK);
        labelNota2.setForeground(Color.BLACK);
        labelNota3.setForeground(Color.BLACK);
        labelNota4.setForeground(Color.BLACK);
        labelNota1.setFont(new Font("Arial", Font.BOLD, 14));
        labelNota2.setFont(new Font("Arial", Font.BOLD, 14));
        labelNota3.setFont(new Font("Arial", Font.BOLD, 14));
        labelNota4.setFont(new Font("Arial", Font.BOLD, 14));
        escMedia.setForeground(Color.BLACK);
        escMedia.setFont(new Font("Arial", Font.BOLD, 14));
        campoResultado.setForeground(Color.BLACK);
        campoResultado.setFont(new Font("Arial", Font.BOLD, 14));
        campoResultado.setBackground(Color.LIGHT_GRAY);
        campo1.setBackground(Color.LIGHT_GRAY);
        campo2.setBackground(Color.LIGHT_GRAY);
        campo3.setBackground(Color.LIGHT_GRAY);
        campo4.setBackground(Color.LIGHT_GRAY);
        campo1.setBorder(null);
        campo2.setBorder(null);
        campo3.setBorder(null);
        campo4.setBorder(null);
        campoResultado.setBorder(null);
        campoMedia.setBackground(Color.LIGHT_GRAY);
        campoMedia.setBorder(null);
        
        
        janela.add(painel);
        painel.add(escMedia);
        painel.add(campoMedia);
        painel.add(labelNota1);
        painel.add(campo1);
        painel.add(labelNota2);
        painel.add(campo2);
        painel.add(labelNota3);
        painel.add(campo3);
        painel.add(labelNota4);
        painel.add(campo4);
        painel.add(botaoEnviar);
        painel.add(campoResultado);
        
        botaoEnviar.addActionListener(e -> {
            NotasCalc calculadora = new NotasCalc();
            double mediaEscolar = Double.parseDouble(campoMedia.getText());
            double nota1 = Double.parseDouble(campo1.getText());
            double nota2 = Double.parseDouble(campo2.getText());
            double nota3 = Double.parseDouble(campo3.getText());
            double nota4 = Double.parseDouble(campo4.getText());
            double media = calculadora.calcularMedia(nota1, nota2, nota3, nota4);
            campoResultado.setText("Sua média anual é de: " + media);
            if (media >= mediaEscolar) {
                JOptionPane.showMessageDialog(janela, "Parabéns! Você passou de ano!");
            } else {
                JOptionPane.showMessageDialog(janela, "Infelizmente você não passou de ano.");
            }
        });
        
        janela.setVisible(true);
    }
}
