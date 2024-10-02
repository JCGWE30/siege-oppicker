module com.pigslayer.siegeoperatorpicker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.pigslayer.siegeoperatorpicker to javafx.fxml;
    exports com.pigslayer.siegeoperatorpicker;
}