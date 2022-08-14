package kviz;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quiz implements ActionListener {
	
	String[] pitanja = { 
			"Koje godine je Niel Armstrong sleteo na Mesec?",
			"Koja je jedina planeta koja nije dobila ime po bogu?",
			"Drugi svetski rat poceo je napadom Nemacke na?",
			"Ko je napravio Javu?"
	};
	String [][] opcije = { 
			{"1969", "1945", "1964", "1959"},
			{"Venera", "Zemlja", "Jupiter", "Mars"},
			{"Francusku", "Jugoslaviju", "Poljsku", "Rusiju"},
			{"Steve Jobs", "Bill Gates", "Mark Zuckerberg", "James Gosling"}
	};
	char [] odgovori = {
			'A',
			'B',
			'C',
			'D'
	};
	char odgovor;
	char tacanOdgovor;
	int index;
	int tacniOdgovori = 0;
	int brojPitanja = pitanja.length;
	int rezultat;
	int tajmer = 10;
	
	JFrame frame = new JFrame();
	JTextField textfield = new JTextField();
	JTextArea textarea = new JTextArea();
	JButton buttonA = new JButton();
	JButton buttonB = new JButton();
	JButton buttonC = new JButton();
	JButton buttonD = new JButton();
	JLabel odgovor_prikazA = new JLabel();
	JLabel odgovor_prikazB = new JLabel();
	JLabel odgovor_prikazC = new JLabel();
	JLabel odgovor_prikazD = new JLabel();
	JLabel vreme_prikaz = new JLabel();
	JLabel tajmer_prikaz = new JLabel();
	JTextField tacan_broj = new JTextField();
	JTextField procenat = new JTextField();
	
	Timer vreme = new Timer(1000, new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			tajmer--;
			tajmer_prikaz.setText(String.valueOf(tajmer));
			
			if (tajmer <= 0) {
				prikaziOdgovor();
			}
		}
	});
	
	public Quiz () {
		
//		FRAME:
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(650,650);
		frame.getContentPane().setBackground(new Color (50,50,50));
		frame.setLayout(null);
		frame.setResizable(false);
		
//		POLJE SA BROJEM PITANJA:
		textfield.setBounds(0,0,650,50);
		textfield.setBackground(new Color(25,25,25,25));
		textfield.setForeground(new Color (25,255,0));
		textfield.setFont(new Font("verdana", Font.BOLD,30));
		textfield.setBorder(BorderFactory.createBevelBorder(1));
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.setEditable(false);
		
//		POLJE SA PITANJEM:
		textarea.setBounds(0,50,650,50);
		textarea.setLineWrap(true);
		textarea.setWrapStyleWord(true);
		textarea.setBackground(new Color(25,25,25,25));
		textarea.setForeground(new Color (25,255,0));
		textarea.setFont(new Font("verdana", Font.BOLD,20));
		textarea.setBorder(BorderFactory.createBevelBorder(1));
		textarea.setEditable(false);
		
//		BUTTONS A B C D:
		buttonA.setBounds(0,100,100,100);
		buttonA.setFont(new Font("verdana", Font.BOLD, 35));
		buttonA.setFocusable(false);
		buttonA.addActionListener(this);
		buttonA.setText("A");
		
		buttonB.setBounds(0,200,100,100);
		buttonB.setFont(new Font("verdana", Font.BOLD, 35));
		buttonB.setFocusable(false);
		buttonB.addActionListener(this);
		buttonB.setText("B");
		
		buttonC.setBounds(0,300,100,100);
		buttonC.setFont(new Font("verdana", Font.BOLD, 35));
		buttonC.setFocusable(false);
		buttonC.addActionListener(this);
		buttonC.setText("C");
		
		buttonD.setBounds(0,400,100,100);
		buttonD.setFont(new Font("verdana", Font.BOLD, 35));
		buttonD.setFocusable(false);
		buttonD.addActionListener(this);
		buttonD.setText("D");
		
//		POLJA SA PONUDJENIM ODGOVORIMA:
		odgovor_prikazA.setBounds(125,100,500,100);
		odgovor_prikazA.setBackground(new Color(50,50,50,50));
		odgovor_prikazA.setForeground(new Color(25,255,0));
		odgovor_prikazA.setFont(new Font("verdana", Font.PLAIN, 35));
		
		odgovor_prikazB.setBounds(125,200,500,100);
		odgovor_prikazB.setBackground(new Color(50,50,50,50));
		odgovor_prikazB.setForeground(new Color(25,255,0));
		odgovor_prikazB.setFont(new Font("verdana", Font.PLAIN, 35));
		
		odgovor_prikazC.setBounds(125,300,500,100);
		odgovor_prikazC.setBackground(new Color(50,50,50,50));
		odgovor_prikazC.setForeground(new Color(25,255,0));
		odgovor_prikazC.setFont(new Font("verdana", Font.PLAIN, 35));
		
		odgovor_prikazD.setBounds(125,400,500,100);
		odgovor_prikazD.setBackground(new Color(50,50,50,50));
		odgovor_prikazD.setForeground(new Color(25,255,0));
		odgovor_prikazD.setFont(new Font("verdana", Font.PLAIN, 35));
		
//		TAJMER:
		tajmer_prikaz.setBounds(535,510,100,100);
		tajmer_prikaz.setBackground(new Color(25,25,25));
		tajmer_prikaz.setForeground(new Color(255,0,0));
		tajmer_prikaz.setFont(new Font("verdana", Font.BOLD, 60));
		tajmer_prikaz.setBorder(BorderFactory.createBevelBorder(1));
		tajmer_prikaz.setOpaque(true);
		tajmer_prikaz.setHorizontalAlignment(JTextField.CENTER);
		tajmer_prikaz.setText(String.valueOf(tajmer));
		
		vreme_prikaz.setBounds(535,475,100,100);
		vreme_prikaz.setBackground(new Color(50,50,50));
		vreme_prikaz.setForeground(new Color(255,0,0));
		vreme_prikaz.setFont(new Font("verdana", Font.BOLD, 20));
		vreme_prikaz.setHorizontalAlignment(JTextField.CENTER);
		vreme_prikaz.setText("Vreme:");
		
//		POLJE SA TACNIM BROJEM ODGOVORA NA KRAJU:
		tacan_broj.setBounds(225,225,200,100);
		tacan_broj.setBackground(new Color(25,25,25));
		tacan_broj.setForeground(new Color(25,255,0));
		tacan_broj.setFont(new Font("verdana", Font.BOLD, 50));
		tacan_broj.setBorder(BorderFactory.createBevelBorder(1));
		tacan_broj.setHorizontalAlignment(JTextField.CENTER);
		tacan_broj.setEditable(false);
		
//		POLJE SA PROCENTOM TACNIH ODGOVORA NA KRAJU:
		procenat.setBounds(225,325,200,100);
		procenat.setBackground(new Color(25,25,25));
		procenat.setForeground(new Color(25,255,0));
		procenat.setFont(new Font("verdana", Font.BOLD, 50));
		procenat.setBorder(BorderFactory.createBevelBorder(1));
		procenat.setHorizontalAlignment(JTextField.CENTER);
		procenat.setEditable(false);
		
//		TEST GDE STA STOJI:
//		textfield.setText("TEKST 1");
//		textarea.setText("TEKST 2");
//		odgovor_prikazA.setText("Tekst A");
//		odgovor_prikazB.setText("Tekst B");
//		odgovor_prikazC.setText("Tekst C");
//		odgovor_prikazD.setText("Tekst D");
//		tacan_broj.setText("99/99");
//		procenat.setText("100%");

//		FRAME ELEMENTI:
		frame.add(vreme_prikaz);
		frame.add(tajmer_prikaz);
		
		frame.add(odgovor_prikazA);
		frame.add(odgovor_prikazB);
		frame.add(odgovor_prikazC);
		frame.add(odgovor_prikazD);
		
		frame.add(buttonA);
		frame.add(buttonB);
		frame.add(buttonC);
		frame.add(buttonD);
		
		frame.add(textarea);
		frame.add(textfield);		
		frame.setVisible(true);
		
		sledecePitanje ();
	}
	public void sledecePitanje() {

		if (index >= brojPitanja) {
			rezultati();
		}
		else {
			textfield.setText("Pitanje " + (index + 1));
			textarea.setText(pitanja[index]);
			odgovor_prikazA.setText(opcije[index][0]);
			odgovor_prikazB.setText(opcije[index][1]);
			odgovor_prikazC.setText(opcije[index][2]);
			odgovor_prikazD.setText(opcije[index][3]);
			
			vreme.start();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		buttonA.setEnabled(false);
		buttonA.setEnabled(false);
		buttonA.setEnabled(false);
		buttonA.setEnabled(false);
		
		if(e.getSource() == buttonA) {
			odgovor = 'A';
			if (odgovor == odgovori[index]) {
				tacniOdgovori++;
			}
		}
		
		if(e.getSource() == buttonB) {
			odgovor = 'B';
			if (odgovor == odgovori[index]) {
				tacniOdgovori++;
			}
		}
		
		if(e.getSource() == buttonC) {
			odgovor = 'C';
			if (odgovor == odgovori[index]) {
				tacniOdgovori++;
			}
		}
		
		if(e.getSource() == buttonD) {
			odgovor = 'D';
			if (odgovor == odgovori[index]) {
				tacniOdgovori++;
			}
		}
		
		prikaziOdgovor ();
		
	}
	public void prikaziOdgovor () {
		
		vreme.stop();
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		if ( odgovori[index] != 'A') {
			odgovor_prikazA.setForeground(new Color(255,0,0));
		}
		if ( odgovori[index] != 'B') {
			odgovor_prikazB.setForeground(new Color(255,0,0));
		}
		if ( odgovori[index] != 'C') {
			odgovor_prikazC.setForeground(new Color(255,0,0));
		}
		if ( odgovori[index] != 'D') {
			odgovor_prikazD.setForeground(new Color(255,0,0));
		}
		
		Timer pauza = new Timer(2000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				odgovor_prikazA.setForeground(new Color(25,255,0));
				odgovor_prikazB.setForeground(new Color(25,255,0));
				odgovor_prikazC.setForeground(new Color(25,255,0));
				odgovor_prikazD.setForeground(new Color(25,255,0));
				
				odgovor = ' ';
				tajmer = 10;
				tajmer_prikaz.setText(String.valueOf(tajmer));
				
				buttonA.setEnabled(true);
				buttonB.setEnabled(true);
				buttonC.setEnabled(true);
				buttonD.setEnabled(true);
				
				index++;
				
				sledecePitanje();
			}
		});
		
		pauza.setRepeats(false);
		pauza.start();
		
	}
	public void rezultati () {
		
		buttonA.setEnabled(false);
		buttonB.setEnabled(false);
		buttonC.setEnabled(false);
		buttonD.setEnabled(false);
		
		frame.remove(buttonA);
		frame.remove(buttonB);
		frame.remove(buttonC);
		frame.remove(buttonD);
		frame.remove(tajmer_prikaz);
		frame.remove(vreme_prikaz);
		frame.remove(textarea);
		
		rezultat = (int)((tacniOdgovori/(double)brojPitanja)*100);
		
		textfield.setText("REZULTAT:");
		textarea.setText("");
		odgovor_prikazA.setText("");
		odgovor_prikazB.setText("");
		odgovor_prikazC.setText("");
		odgovor_prikazD.setText("");
		
		tacan_broj.setText(tacniOdgovori + "/" + brojPitanja);
		procenat.setText(rezultat + "%");
		
		frame.add(procenat);
		frame.add(tacan_broj);
		
	}
}
