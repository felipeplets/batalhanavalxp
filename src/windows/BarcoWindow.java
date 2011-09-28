package src.windows;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import src.connections.Client;
import src.connections.Server;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * barcos.java
 *
 * Created on 24/09/2011, 00:32:15
 */
/**
 *
 * @author Felipe Barth
 */
public class BarcoWindow extends javax.swing.JFrame {

	protected Server socketServer;
	protected Client socketClient;
    
	private static String type;
	
	/** Creates new form barcos */
    
	//public BarcoWindow(String type_temp, int tipo_barco){
    public BarcoWindow(String type_temp, int tipo_barco, Server server, Client client){
    	type = type_temp;
    	
        if( tipo_barco == PORTA_AVIOES )              
        {
            nome_barco = "Porta Avi�es";
            tamanho = PORTA_AVIOES;
        }
        else if( tipo_barco == NAVIO_QUATRO_CANHOES )
        {
            nome_barco = "Navio Quatro canhoes";
            tamanho = NAVIO_QUATRO_CANHOES;
        }
        else if( tipo_barco == NAVIO_TRES_CANHOES )
        {
            nome_barco = "Navio tr�s canhoes";
            tamanho = NAVIO_TRES_CANHOES;
        }
        else if( tipo_barco == NAVIO_DOIS_CANHOES )
        {
            nome_barco = "Navio dois canhoes";
            tamanho = NAVIO_DOIS_CANHOES;
        }
        else
        {
            nome_barco = "Submarino";
            tamanho = SUBMARINO;
        }
         
        
        if(type.equals("Server")){
        	socketServer = server;
        	initComponents(nome_barco, tamanho, type, server, null);
        }else{
        	socketClient = client;
        	initComponents(nome_barco, tamanho, type, null, client);
        }
        
        //initComponents(nome_barco, tamanho, type);
       
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents(String nome_barco, int tamanho, String type, Server server, Client client) {
    //private void initComponents(String nome_barco, int tamanho, String type) {	
        grupo_posicoes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        // Refer�ncia criada pois a a��o do bot�o n�o reconhecia a variavel estatica
        final String gameType = type;
        
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados do barco"));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Linha"));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Coluna"));

   

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Posi��o"));

        grupo_posicoes.add(jRadioButton1);
        jRadioButton1.setText("Vertical");
        
        grupo_posicoes.add(jRadioButton2);
        jRadioButton2.setText("Horizontal");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Nome do barco "));

        jLabel1.setText(nome_barco+" - "+tamanho+" posi��es");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jButton1.setText("Enviar");
         jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                
            	if (gameType.equals("Server")){
            		jButton1ActionPerformed(evt, socketServer, null);
            	}else{
            		jButton1ActionPerformed(evt, null, socketClient);
            	}
            	
            	//jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jButton1)
                .addGap(29, 29, 29))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>

    //private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
private void jButton1ActionPerformed(java.awt.event.ActionEvent evt, Server server, Client client) {
// TODO add your handling code here:

	// Verifica se usuario nao digitou caracteres invalidos
	if ( (!Pattern.matches( "[-]?\\d*[.]?\\d+", jTextField1.getText())) | (!Pattern.matches( "[-]?\\d*[.]?\\d+", jTextField2.getText())) )
    {
    	JOptionPane.showMessageDialog(null, "Voc� deve preencher campo linha e coluna com valores de 1 a 10" );
    }
	// Verifica se usuario digitou os valores para coluna e linha
	else if( jTextField1.getText().isEmpty()|| jTextField2.getText().isEmpty() )
    {
        JOptionPane.showMessageDialog(null, "Voc� deve preencher campo linha e coluna com valores de 1 a 10" );
    }
    // Verifica se usuario nao digitou valores maiores que 10 para coluna e linha
    else if ( (Integer.valueOf(jTextField1.getText()) > 10) || (Integer.valueOf(jTextField2.getText()) > 10) )
    {
    	JOptionPane.showMessageDialog(null, "Voc� deve preencher campo linha e coluna com valores de 1 a 10" );
    }
	// Verifica se usuario selecionou a posicao do barco
    else if ( (!jRadioButton1.isSelected()) && (!jRadioButton2.isSelected()) )
    {
    	JOptionPane.showMessageDialog(null, "Voc� deve selecionar a posi��o do barco como vertical ou horizontal" );
    }
    else
    {
    	// Armazena valores digitados pelo usuario para linha e coluna
        linha_ini = Integer.valueOf( jTextField1.getText() );
        coluna_ini = Integer.valueOf( jTextField2.getText() );
        
        // Verifica qual radio button foi selecionado para definir o angulo
        if( jRadioButton1.isSelected() )
        {
            angulo = VERTICAL;
        }
        else
        {
            angulo = HORIZONTAL;
        }
        this.setVisible(false);
        
        
        int [] linha_invalida = new int[tamanho];
        int [] coluna_invalida = new int[tamanho];
        int posinv = 0;
        
        // Percorre todas posicoes do barco para verificar se alguma eh invalida
        for(int count=0; count<tamanho; count++)
        {
        	int temp_coluna, temp_linha;
        	
        	// Angulo eh vertical
            if( angulo == VERTICAL )
            {
            	temp_coluna = coluna_ini;
            	temp_linha = linha_ini+count;
            }
            //Angulo eh horizontal
            else 
            {   
            	temp_coluna = coluna_ini+count;
            	temp_linha = linha_ini;
            }
            
            // Se posicao for invalida guarda em array para informar usuario
            if ( (tabuleiro[temp_linha][temp_coluna] > 0) || (temp_linha > 10) || (temp_coluna > 10) ){
            	linha_invalida[posinv] = temp_linha;
            	coluna_invalida[posinv] = temp_coluna;
            	posinv++;
            }
        }

        // Alguma posicao do barco nao eh valida
        if ( posinv > 0)
        {
        	String msg;
        	
        	msg = "A(s) posi��o(�es) ";
        	
        	for ( int count=0; count < posinv; count++ )
        	{
        		msg = msg + "[linha " + String.valueOf(linha_invalida[count]) + " x coluna " + String.valueOf(coluna_invalida[count]) + "] ";
        	}
        	
        	msg = msg + "n�o s�o v�lidas ou j� est�o ocupadas por outro barco";

        	// Exibe mensagem para usuario
        	JOptionPane.showMessageDialog(null, msg );
        	
        	if (type.equals("Server")){
		    	// Instancia objeto para solicitar dados novamente
		    	new BarcoWindow(type, tamanho, server, null).setVisible(true);
        	}else{
        		new BarcoWindow(type, tamanho, null, client).setVisible(true);
        	}
        	//new BarcoWindow(type, tamanho).setVisible(true);
        }
        
        // Todas posicoes do barco sao validas
        else
        {
        	// Percorre todas posicoes do barco para gravar o seu 'ID' (tamanho) na matriz
            for(int count=0; count<tamanho; count++)
            {
            	// Angulo eh vertical
                if( angulo == VERTICAL )
                {
                    tabuleiro[linha_ini+count][coluna_ini] = tamanho;   
                }
                //Angulo eh horizontal
                else 
                {   
                	tabuleiro[linha_ini][coluna_ini+count] = tamanho;  
                	
                }
            }
        	
        	 // Se existir ainda barco para solicitar posicoes, instancia novamente a classe
            if(tamanho != 1)
            {
                tamanho--;
                
                if (type.equals("Server")){
                	new BarcoWindow(type, tamanho, server, null).setVisible(true);
                }else{
                	new BarcoWindow(type, tamanho, null, client).setVisible(true);
                }
            	
                //new BarcoWindow(type, tamanho).setVisible(true);
            }
            // Obtido dados de todos os barcos. prossegue para o tabuleiro
            else{
            	// Instancia objeto que ira exibir o tabuleiro do jogo
            	
            	if (type.equals("Server")){
            		new BoardWindow(tabuleiro, type, server, null);
                }else{
                	new BoardWindow(tabuleiro, type, null, client);
                }
            	
            	//new BoardWindow(tabuleiro, type);
            	//System.out.println("terminou");

            }
        }

    }
}

    // Variables declaration - do not modify
    private javax.swing.ButtonGroup grupo_posicoes;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JRadioButton jRadioButton1; //vertical
    private javax.swing.JRadioButton jRadioButton2; // horizontal
    private javax.swing.JTextField jTextField1; // linha
    private javax.swing.JTextField jTextField2; // coluna
    
    // Cria matriz tabuleiro que armazenara o id do barco nas posicoes informadas pelo usuario
    private static int[][] tabuleiro = new int[10][10];

    // Cria um id para cada barco que eh igual ao seu tamanho
    private final int PORTA_AVIOES          = 5;
    private final int NAVIO_QUATRO_CANHOES  = 4;    
    private final int NAVIO_TRES_CANHOES    = 3;    
    private final int NAVIO_DOIS_CANHOES    = 2;    
    private final int SUBMARINO             = 1;  
    
    // Cria um id para cada posicao
    private final int VERTICAL              = 1;  
    private final int HORIZONTAL            = 2;  

    // Define linha inicial e coluna inicial como zero
    private int linha_ini = 0;
    private int coluna_ini = 0;
    
    private int angulo;
    private int tipo;
    private String nome_barco;
    private int tamanho;
    
    // M�todo que verifica se tem alguma letra
 	public boolean hasLetters( String temp){
 		
 		boolean check = false;
 		
 		Pattern pattern = Pattern.compile("[1-10]");  
        Matcher match = pattern.matcher(temp);
           
         if(!match.find()) {   
 			return true;
 		}
 		
 		return check;
 	}
}
