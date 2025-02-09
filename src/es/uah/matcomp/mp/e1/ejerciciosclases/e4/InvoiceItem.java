package es.uah.matcomp.mp.e1.ejerciciosclases.e4;

/**
 * The InvoiceItem class models  with id, desc, qty and unitPrice.
 */
public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    /** Constructs an InvoiceItem instance */
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }
    /** Returns the id */
    public String getId() {
        return id;
    }
    /** Returns the desc */
    public String getDesc() {
        return desc;
    }
    /** Returns the qty */
    public int getQty() {
        return qty;
    }
    /** Setter for qty */
    public void setQty(int qty) {
        this.qty = qty;
    }
    /** Returns the unitPrice  */
    public double getUnitPrice() {
        return unitPrice;
    }
    /** Setter for unitPrice */
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    /** Return for the total */
    public double getTotal() {
        return qty * unitPrice;
    }
    /** Override toString() method */
    @Override
    public String toString() {
        return "InvoiceItem[id=" + id + ", desc=" + desc + ", qty=" + qty + ",unitPrice=" + unitPrice + "]" ;
    }
}
