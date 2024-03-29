package src.windows;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import src.connections.Client;

public class ClientWindow extends JFrame{

	private static final long serialVersionUID = 42;
	
	public Container cwFrame; // container que guarda os objetos
	public JLabel lbClientIp;	// label do ip do server a ser acessado
	public JTextField tfClientIp;	// textfield para inserir ip do server
	public JLabel lbClientPort;	// label da porta do server a ser acessado
	public JTextField tfClientPort;	// textfield para inserir porta do server
	public JButton btReturn;	// bot�o para retornar a tela inicial
	public JButton btAccessServer;	// bot�o para acessar o server com os dados passados(chama m�todo)

	// M�todo construtor da Tela acessar servidor
	public ClientWindow(){
		
		// Determina nome Janela
		super("Acessando um Servidor");
		
		// Cria um Container
		cwFrame = this.getContentPane();
		cwFrame.setLayout(null);
		
		// Cria Label sobre Campo IP do Servidor a ser acessado
		lbClientIp = new JLabel("Digite o IP:");
		lbClientIp.setBounds(10, 10, 100, 50);
		
		// Cria TextField sobre Campo IP do Servidor a ser acessado. Que vai receber informa��es
		// do usu�rio
		
		tfClientIp = new JTextField();
		tfClientIp.setBounds(105, 10, 125, 50);
		
		// Cria Label sobre Campo Porta do Servidor a ser acessado
		lbClientPort = new JLabel("Digite a Porta:");
		lbClientPort.setBounds(10, 60, 120, 50);
		
		// Cria TextField sobre Campo Porta do Servidor a ser acessado. Que vai receber informa��es
		// do usu�rio
		tfClientPort = new JTextField("");
		tfClientPort.setBounds(125, 60, 105, 50);
		
		// Cria Bot�o respons�vel por retornar a Tela Inicial
		btReturn = new JButton("Cancelar");
		btReturn.setBounds(10, 115, 80, 40);
		btReturn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	setVisible(false);
                new BeginWindow();
            }
        });
		
		// Cria Bot�o respons�vel por enviar dados para Startar o Servidor
		btAccessServer = new JButton("Acessar");
		btAccessServer.setBounds(150, 115, 80, 40);
		btAccessServer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
            	Client client = new Client(tfClientIp.getText(), tfClientPort.getText());
             	setVisible(false);
                client.start();
                new BoardWindow("Client", null, client);
            }
        });
		
		// Adiciona Bot�es, Labels e Textfields ao Container
		cwFrame.add(lbClientIp);
		cwFrame.add(tfClientIp);
		cwFrame.add(lbClientPort);
		cwFrame.add(tfClientPort);
		cwFrame.add(btAccessServer);
		cwFrame.add(btReturn);
				
		// Configura detalhes do Frame
		// 1. Encerrar Applica��o ao Fechar
		// 2. Setar as dimens�es do Frame
		// 3. Setar Frame como Vis�vel
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 1
		this.setSize(240, 180); // 2
		this.setVisible(true); // 3
	}

}
