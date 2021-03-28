package client;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import proto.CreateCarRequest;
import proto.CreateCarResponse;
import proto.DeleteCarRequest;
import proto.DeleteCarResponse;
import proto.GetCarRequest;
import proto.GetCarResponse;
import proto.ListCarRequest;
import proto.ListCarResponse;
import proto.Car;
import proto.CarServiceGrpc;

public class CarClient{
	
	
	static int carId;

	public static void main(String[] args){
		CarClient main = new CarClient();
		main.run();
	}

	private void run() {
		//create a communication channel
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 50051).usePlaintext().build();
		CarServiceGrpc.CarServiceBlockingStub carClient = CarServiceGrpc.newBlockingStub(channel);
		
		//create graphical user interface
	    JPanel optionsPanel = new JPanel ();
	    optionsPanel.setBorder(new TitledBorder (new EtchedBorder (), "Options"));
	    optionsPanel.setLayout(new BoxLayout(optionsPanel, BoxLayout.Y_AXIS));
	    optionsPanel.setPreferredSize(new Dimension(600,400));
	    optionsPanel.setMinimumSize(optionsPanel.getPreferredSize());
	    optionsPanel.setMaximumSize(optionsPanel.getPreferredSize());
	    
	    JPanel form_createPanel = new JPanel();
	    form_createPanel.setBorder(new TitledBorder (new EtchedBorder (), "New car registry"));
	    form_createPanel.setLayout(null);
	    
	    JPanel form_getPanel = new JPanel();
	    form_getPanel.setBorder(new TitledBorder (new EtchedBorder (), "Search car registry"));
	    form_getPanel.setLayout(null);
	    
	    
	    JPanel form_deletePanel = new JPanel();
	    form_deletePanel.setBorder(new TitledBorder (new EtchedBorder (), "Delete car registry"));
	    form_deletePanel.setLayout(null);

	    JTextArea display = new JTextArea ( 16, 58 );
	    display.setEditable ( false ); // set textArea non-editable
	    JScrollPane scroll = new JScrollPane ( display );
	    scroll.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );

	    //Create panel 
	    JButton add_button = new JButton();
	    add_button.setPreferredSize(new Dimension(200,20));
	    add_button.setMinimumSize(add_button.getPreferredSize());
	    add_button.setMaximumSize(add_button.getPreferredSize());
	    add_button.setAlignmentX(Component.CENTER_ALIGNMENT);
	    add_button.setText("Register new car");
	    add_button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JLabel lab_modelName = new JLabel();
				lab_modelName.setText("ModelName");
				lab_modelName.setBounds(0, 20, 165, 25);
				
				JTextArea text_modelName = new JTextArea();
				text_modelName.setBounds(100, 20, 165, 25);
				
				JLabel lab_manufacturer = new JLabel();
				lab_manufacturer.setText("manufacturer");
				lab_manufacturer.setBounds(0, 40, 165, 25);
				
				JTextArea text_manufacturer = new JTextArea();
				text_manufacturer.setBounds(100, 40, 165, 25);
				
				JLabel lab_productionYear = new JLabel();
				lab_productionYear.setText("Production Year");
				lab_productionYear.setBounds(0, 60, 165, 25);
				
				JTextArea text_productionYear = new JTextArea();
				text_productionYear.setBounds(100, 60, 165, 25);
				
				JLabel lab_modelYear = new JLabel();
				lab_modelYear.setText("Model Year");
				lab_modelYear.setBounds(0, 80, 165, 25);
				
				JTextArea text_modelYear = new JTextArea();
				text_modelYear.setBounds(100, 80, 165, 25);
				
				JLabel lab_value = new JLabel();
				lab_value.setText("Value");
				lab_value.setBounds(0, 100, 165, 25);
				
				JTextArea text_value = new JTextArea();
				text_value.setBounds(100, 100, 165, 25);
				
				JButton press_Ok = new JButton();
				press_Ok.setBounds(100, 130, 165, 25);
				press_Ok.setText("Ok");
				press_Ok.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						 // CREATE CAR
						Car car = Car.newBuilder().setModelName(text_modelName.getText())
								.setManufacturer(text_manufacturer.getText())
								.setProductionYear(text_productionYear.getText())
								.setModelYear(text_modelYear.getText())
								.setPrice(Double.parseDouble(text_value.getText()))
								.build();
						CreateCarResponse createCarResponse = carClient
								.createCar(CreateCarRequest.newBuilder().setCar(car).build());
						//System.out.println(createCarResponse.toString());
						display.setText(null);
						display.setText(display.getText() + "\n" + "Created:");
						display.setText(display.getText() + "\n" + createCarResponse.toString());

						carId = createCarResponse.getCar().getId();
					}
					
				});
				
				form_createPanel.add(lab_modelName);
				form_createPanel.add(text_modelName);
				form_createPanel.add(lab_manufacturer);
				form_createPanel.add(text_manufacturer);
				form_createPanel.add(lab_productionYear);
				form_createPanel.add(text_productionYear);
				form_createPanel.add(lab_modelYear);
				form_createPanel.add(text_modelYear);
				form_createPanel.add(lab_value);
				form_createPanel.add(text_value);
				form_createPanel.add(press_Ok);
				
				
				JFrame formFrame = new JFrame();
				formFrame.add(form_createPanel);
				formFrame.pack ();
			    formFrame.setLocationRelativeTo ( null );
			    formFrame.setBounds(100, 100, 325, 350);
			    formFrame.setVisible ( true ); 

			}  
	    });  
	    
	    
	    JButton get_button = new JButton();
	    get_button.setPreferredSize(new Dimension(200,20));
	    get_button.setMinimumSize(add_button.getPreferredSize());
	    get_button.setMaximumSize(add_button.getPreferredSize());
	    get_button.setAlignmentX(Component.CENTER_ALIGNMENT);
	    
	    get_button.setText("Search");
	    get_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel lab_carId = new JLabel();
				lab_carId.setText("Car Id");
				lab_carId.setBounds(0, 20, 165, 25);
				
				JTextArea text_carId = new JTextArea();
				text_carId.setBounds(100, 20, 165, 25);
				
				JButton press_Ok = new JButton();
				press_Ok.setBounds(100, 50, 165, 25);
				press_Ok.setText("Ok");
				press_Ok.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// Get CAR
						GetCarResponse getCarResponse = carClient.getCar(GetCarRequest.newBuilder().setCarId(Integer.parseInt(text_carId.getText())).build());
						System.out.println(getCarResponse.getCar());
						display.setText(null);
						display.setText(display.getText() + "\n" + "Result:");
						display.setText(display.getText() + "\n" + getCarResponse.getCar());
	
					}
					
				});
				
				form_getPanel.add(lab_carId);
				form_getPanel.add(text_carId);
				form_getPanel.add(press_Ok);
				
				JFrame formFrame = new JFrame();
				formFrame.add(form_getPanel);
				formFrame.pack ();
			    formFrame.setLocationRelativeTo ( null );
			    formFrame.setBounds(100, 100, 325, 350);
			    formFrame.setVisible ( true ); 
			}
	    	
	    });
	    
	    JButton delete_button = new JButton();
	    delete_button.setPreferredSize(new Dimension(200,20));
	    delete_button.setMinimumSize(add_button.getPreferredSize());
	    delete_button.setMaximumSize(add_button.getPreferredSize());
	    delete_button.setAlignmentX(Component.CENTER_ALIGNMENT);
	    delete_button.setText("Delete");
	    delete_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JLabel lab_carId = new JLabel();
				lab_carId.setText("Car Id");
				lab_carId.setBounds(0, 20, 165, 25);
				
				JTextArea text_carId = new JTextArea();
				text_carId.setBounds(100, 20, 165, 25);
				
				JButton press_Ok = new JButton();
				press_Ok.setBounds(100, 50, 165, 25);
				press_Ok.setText("Ok");
				press_Ok.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// DELETE USER
						DeleteCarResponse deleteCarResponse = carClient
								.deleteCar(DeleteCarRequest.newBuilder().setCarId(Integer.parseInt(text_carId.getText())).build());
						System.out.println(deleteCarResponse.getCarId());
						display.setText(null);
						display.setText(display.getText() + "\n" + "Deleted:");
						display.setText(display.getText() + "\n" + deleteCarResponse.getCarId());
						
					}
					
				});
				form_deletePanel.add(lab_carId);
				form_deletePanel.add(text_carId);
				form_deletePanel.add(press_Ok);
				
				JFrame formFrame = new JFrame();
				formFrame.add(form_deletePanel);
				formFrame.pack ();
			    formFrame.setLocationRelativeTo ( null );
			    formFrame.setBounds(100, 100, 325, 350);
			    formFrame.setVisible ( true ); 
			}
	    	
	    });
	    
	    JButton list_button = new JButton();
	    list_button.setPreferredSize(new Dimension(200,20));
	    list_button.setMinimumSize(add_button.getPreferredSize());
	    list_button.setMaximumSize(add_button.getPreferredSize());
	    list_button.setAlignmentX(Component.CENTER_ALIGNMENT);
	    list_button.setText("List");
	    list_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// LIST USERS
				ListCarResponse listCarResponse = carClient.listCar(ListCarRequest.newBuilder().build());
				System.out.println(listCarResponse.getCarList());
				display.setText(null);
				display.setText(display.getText() + "\n" + "List:");
				display.setText(display.getText() + "\n" + listCarResponse.getCarList());
				
			}
	    	
	    });
	    
	    JButton update_button = new JButton();
	    update_button.setPreferredSize(new Dimension(200,20));
	    update_button.setMinimumSize(add_button.getPreferredSize());
	    update_button.setMaximumSize(add_button.getPreferredSize());
	    update_button.setAlignmentX(Component.CENTER_ALIGNMENT);
	    
	    update_button.setText("Edit registry");
	    update_button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JLabel lab_carId = new JLabel();
				lab_carId.setText("Car Id");
				lab_carId.setBounds(0, 20, 165, 25);
				
				JTextArea text_carId = new JTextArea();
				text_carId.setBounds(100, 20, 165, 25);
				
				JLabel lab_carName = new JLabel();
				lab_carName.setText("Model name");
				lab_carName.setBounds(0, 40, 165, 25);
				
				JTextArea text_carName = new JTextArea();
                text_carName.setBounds(100, 40, 165, 25);
                
                JLabel lab_carManufacturer = new JLabel();
                lab_carManufacturer.setText("Manufacturer");
                lab_carManufacturer.setBounds(0, 60, 165, 25);
				
				JTextArea text_carManufacturer = new JTextArea();
				text_carManufacturer.setBounds(100, 60, 165, 25);
				
				JLabel lab_carProductionYear = new JLabel();
				lab_carProductionYear.setText("Production Year");
				lab_carProductionYear.setBounds(0, 80, 165, 25);
				
				JTextArea text_carProductionYear = new JTextArea();
				text_carProductionYear.setBounds(100, 80, 165, 25);
				
				JLabel lab_carModelYear = new JLabel();
				lab_carModelYear.setText("Model Year");
				lab_carModelYear.setBounds(0, 100, 165, 25);
				
				JTextArea text_carModelYear = new JTextArea();
				text_carModelYear.setBounds(100, 100, 165, 25);
				
				JLabel lab_carPrice = new JLabel();
				lab_carPrice.setText("Price");
				lab_carPrice.setBounds(0, 120, 165, 25);
				
				JTextArea text_carPrice = new JTextArea();
				text_carPrice.setBounds(100, 120, 165, 25);
                
				
				JButton press_Ok = new JButton();
				press_Ok.setBounds(100, 150, 165, 25);
				press_Ok.setText("Ok");
				press_Ok.addActionListener(new ActionListener() {

					@Override
					public void actionPerformed(ActionEvent e) {
						// Get CAR
						GetCarResponse getCarResponse = carClient.getCar(GetCarRequest.newBuilder().setCarId(Integer.parseInt(text_carId.getText())).build());
						System.out.println(getCarResponse.getCar());
						display.setText(null);
						display.setText(display.getText() + "\n" + "Result:");
						display.setText(display.getText() + "\n" + getCarResponse.getCar());
						
						// DELETE Car
						DeleteCarResponse deleteCarResponse = carClient
								.deleteCar(DeleteCarRequest.newBuilder().setCarId(Integer.parseInt(text_carId.getText())).build());
						System.out.println(deleteCarResponse.getCarId());
						display.setText(null);
						display.setText(display.getText() + "\n" + "Deleted:");
						display.setText(display.getText() + "\n" + deleteCarResponse.getCarId());
	
						// Recreate CAR
						Car car = Car.newBuilder()
								.setId(Integer.parseInt(text_carId.getText()))
								.setModelName(text_carName.getText())
								.setManufacturer(text_carManufacturer.getText())
								.setProductionYear(text_carProductionYear.getText())
								.setModelYear(text_carModelYear.getText())
								.setPrice(Double.parseDouble(text_carPrice.getText()))
								.build();
						
						CreateCarResponse createCarResponse = carClient
								.createCar(CreateCarRequest.newBuilder().setCar(car).build());
						//System.out.println(createCarResponse.toString());
						display.setText(null);
						display.setText(display.getText() + "\n" + "Edit:");
						display.setText(display.getText() + "\n" + createCarResponse.toString());
					}
					
				});
				
				form_getPanel.add(lab_carId);
				form_getPanel.add(text_carId);
				form_getPanel.add(lab_carName);
				form_getPanel.add(text_carName);
				form_getPanel.add(lab_carManufacturer);
				form_getPanel.add(text_carManufacturer);
				form_getPanel.add(lab_carProductionYear);
				form_getPanel.add(text_carProductionYear);
				form_getPanel.add(lab_carModelYear);
				form_getPanel.add(text_carModelYear);
				form_getPanel.add(lab_carPrice);
				form_getPanel.add(text_carPrice);
				form_getPanel.add(press_Ok);
				
				JFrame formFrame = new JFrame();
				formFrame.add(form_getPanel);
				formFrame.pack ();
			    formFrame.setLocationRelativeTo ( null );
			    formFrame.setBounds(100, 100, 325, 350);
			    formFrame.setVisible ( true ); 
			}
	    	
	    });
	    
	    JButton disconnect_button = new JButton();
	    disconnect_button.setPreferredSize(new Dimension(200,20));
	    disconnect_button.setMinimumSize(add_button.getPreferredSize());
	    disconnect_button.setMaximumSize(add_button.getPreferredSize());
	    disconnect_button.setText("Disconnect");
	    disconnect_button.setAlignmentX(Component.CENTER_ALIGNMENT);
        disconnect_button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				channel.shutdown();
				try {
					channel.awaitTermination(1000, TimeUnit.MILLISECONDS);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
        });
	   
	    //Add buttons
	    optionsPanel.add(add_button);
	    optionsPanel.add(get_button);
	    optionsPanel.add(delete_button);
	    optionsPanel.add(list_button);
	    optionsPanel.add(update_button);
	    optionsPanel.add(disconnect_button);
	    optionsPanel.add(scroll);
	    

	    // My code
	    JFrame frame = new JFrame ();
	    frame.add(optionsPanel, BorderLayout.CENTER);
	    
	    frame.pack ();
	    frame.setLocationRelativeTo ( null );
	    frame.setVisible ( true );
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}

}
