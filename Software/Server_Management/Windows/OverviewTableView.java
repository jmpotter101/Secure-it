package server_management.overview;

import javax.swing.text.Element;
import javax.swing.text.TableView;

public class OverviewTableView extends TableView {
  /**
    * Constructs a TableView for the given Element
    *
    * @param elem the element that this view is responsible for
    */
    public OverviewTableView(Element elem) {
      super(elem);
    }
}
