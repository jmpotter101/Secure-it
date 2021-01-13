public server_management.overview;

import javafx.scene.layout.BorderPane;

public class OverviewPane extends BorderPane {
  private OverviewLeftPane overviewLeftPane = null;
  private OverviewTableView overviewTableView = null;
  public OverviewPane() {
    initStuff();
  }
  
  private void initStuff(){
    this.setTop(new Text("In the table we can see the products for sale."));
    this.setLeft(getOverviewLeftPane());
    this.setCenter(getOverviewTableView(();
  }
  
  private OverviewLeftPane getOverviewLeftPane() {
    if (overviewLeftPane = null){
      overviewLeftPane = new OverviewLeftPane();
    }
    return overviewLeftPane;
  }
  
  public OverviewTableView getOverviewTableView() {
    if (overviewTableView == null){
      overviewTableView = new OverviewTableView();
    }
    return overviewTableView; 
  }
  
}
