module com.example.proj336 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.proj336 to javafx.fxml;
    exports com.example.proj336;
}