package buscarYReemplazar;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BuscarYReemplazar extends Application {

	private TextField nombreText;
	private TextField apellidoText;
    private Button buscarButton;
    private Button reemplazarButton;
    private Button reemplazartodoButton;
    private Button cerrarButton;
    private Button ayudaButton;
    
	@Override
	public void start(Stage primaryStage) throws Exception {
		nombreText = new TextField();
	
		
		apellidoText = new TextField();
		
		
		buscarButton=new Button("Buscar");
		buscarButton.setMaxWidth(100);
		reemplazarButton=new Button("Reemplazar");
		reemplazarButton.setMaxWidth(100);
		reemplazartodoButton=new Button("Reemplazar todo");
		reemplazartodoButton.setMaxWidth(100);
		cerrarButton=new Button("Cerrar");
		cerrarButton.setMaxWidth(100);
		ayudaButton=new Button("Ayuda");
		ayudaButton.setMaxWidth(100);
		
		VBox botonesBox=new VBox(5);
		botonesBox.getChildren().addAll(buscarButton,reemplazarButton,reemplazartodoButton,
				cerrarButton,ayudaButton);
		CheckBox mayMinBox = new CheckBox("Mayusculas y minusculas");
		CheckBox mostraBox = new CheckBox("Mostrar atras");
		VBox checkboxBox = new VBox(5);
		checkboxBox.getChildren().addAll(mayMinBox,mostraBox);
		
		CheckBox expresionBox = new CheckBox("Expresion regular");
		CheckBox resaltarBox = new CheckBox("Resaltar resultado");
		VBox checkboxBox2 = new VBox(5);
		checkboxBox2.getChildren().addAll(expresionBox,resaltarBox);
		
		HBox chekBox=new HBox(5);
		chekBox.getChildren().addAll(checkboxBox,checkboxBox2);
		
		
		
		GridPane formPane=new GridPane();
		
		formPane.setHgap(5);
		formPane.setVgap(5);
		formPane.setPadding(new Insets(5));
		formPane.addRow(0, new Label("Buscar: "), nombreText);
		formPane.addRow(1, new Label("Reemplazar con: "), apellidoText);
//		formPane.addRow(2, checkboxBox);
		formPane.addColumn(1, chekBox);
		formPane.addColumn(2, botonesBox);
		GridPane.setRowSpan(botonesBox, 5);
		

		ColumnConstraints [] cols = {
				new ColumnConstraints(),
				new ColumnConstraints(),
				new ColumnConstraints()
		};
		formPane.getColumnConstraints().setAll(cols);
		cols[1].setHgrow(Priority.ALWAYS);
		
		//restricciones especifica
		
//		GridPane.setFillWidth(dniText, false);
		
		//panel inferior
		
		
		
		//panel raiz
		
		BorderPane root = new BorderPane();
		root.setPadding(new Insets(5));
		root.setCenter(formPane);
	
		//escena
		
		Scene scene = new Scene(root,640,480);
		primaryStage.setTitle("GridPane Sample");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);

	}

}
