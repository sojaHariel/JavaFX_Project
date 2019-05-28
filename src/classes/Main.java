package classes;



import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

	Stage window;
	Scene scene;
	Button button;
	
	Palavras palavras = new Palavras();
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		window = primaryStage;
		window.setTitle("Program Title");
		
		Label labelWordEnglish = new Label("English Word");
		TextField englishWordInput = new TextField();
		Label labelWordPortuguese = new Label("Portuguese Word");
		TextField portugueseWordInput = new TextField();
		Label labelPhraseEnglish = new Label("English Phrase");
		TextField englishPhraseInput = new TextField();
		Label labelPhrasePortuguese = new Label("Portuguese Phrase");
		TextField portuguesePhraseInput = new TextField();
		
		
		button = new Button("Enviar");
		// event when "Enviar" button is clicked
		button.setOnAction(e -> {
			try {
				if(englishWordInput.getText().length() < 2 && portugueseWordInput.getText().length() < 2 && englishPhraseInput.getText().length() < 2 && portuguesePhraseInput.getText().length() < 2) {
					AlertBox.display("Advice", "Invalid input");
				}
				Palavra nova = new Palavra(englishWordInput.getText(), portugueseWordInput.getText(), englishPhraseInput.getText(), portuguesePhraseInput.getText());
				palavras.addPalavra(nova);
				System.out.println("Palavra adicionada com sucesso!");
			} catch(Exception erro) {
				System.out.println("Nao foi possivel adicionar a nova palavra devido ao seguinte erro: " + erro);
			}
		});
		
		window.setOnCloseRequest(e -> closeProgram());
		
		//Layout
		VBox layout = new VBox(10);
		layout.setPadding(new Insets(20, 20, 20, 20));
		layout.getChildren().addAll(labelWordEnglish, englishWordInput, labelWordPortuguese, portugueseWordInput, labelPhraseEnglish, englishPhraseInput, labelPhrasePortuguese, portuguesePhraseInput, button);
		
		scene = new Scene(layout, 300, 380);
		window.setScene(scene);
		window.show();
		
	}
	
	private void closeProgram() {
		System.out.println(palavras.toString());
		window.close();
	}
	
}

