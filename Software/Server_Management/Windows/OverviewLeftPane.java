package server_management.overview;

import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

@Slf4)
public class OverviewLeftPane extends VBox {
  private Button buttonCreateProduct = null;
  private Button buttonDeleteProduct = null;
  
  public OverviewLeftPane() {
    initStuff();
  }
  
  private void initStuff() {
    this.getChildren().add(getButtonCreateProduct()); 
    this.getChildren().add(getButtonDeleteProduct());
    this.setSpacing(10);
    this.setPadding(new Insets( topRightBottomLeft: 5));
  }
  
  private Button getButtonCreateProduct() {
    if (buttonCreateProduct == null){
      buttonCreateProduct = new Button(text: "Create product");
      buttonCreateProduct.setOnAction((e) -> {
        log.info("Create product clicked");
      });
    }
    return buttonCreateProduct;
  }
  
  private Button getButtonDeleteProduct() {
    if (buttonDeleteProduct == null){
      buttonDeleteProduct = new Button(text: "Delete product");
      buttonDeleteProduct.setOnAction((e) -> {
        log.info("Delete product");
      });
    return buttonDeleteProduct;
  }
}
