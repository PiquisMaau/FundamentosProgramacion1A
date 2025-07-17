
import java.time.LocalDate;
import java.util.LinkedList;
import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.html.simpleparser.HTMLWorker;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.io.StringReader;

public class App {

    public static String generarHTMLlistDetalleFactura(LinkedList<DetalleFactura> listaFactura) {
        String codigoHTML = "";
        codigoHTML += "<table>";
        codigoHTML += "<tr><td><b>Producto</b></td><td><b>Precio</b></td><td><b>Cantidad</b></td><td><b>Subtotal</b></td></tr>";

        for (DetalleFactura item : listaFactura) {
            codigoHTML += "<tr><td>" + item.getProducto() + "</td><td>" + item.getPrecio() + "</td><td>"
                    + item.getCantidad() + "</td><td>" + item.getSubtotal() + "</td></tr>";

        }

        codigoHTML += "</table>";

        return codigoHTML;
    }

    public static String generarClienteHTML(Cliente cliente) {
        String codigoHTML = "";
        codigoHTML += "<table>";
        codigoHTML += "<tr><td><b>Nombre: </b></td> <td> " + cliente.getNombre() + "</td></tr>" +
                "<tr> <td><b>Cedula: </b></td><td>" + cliente.getCedula() + "</td></tr>" +
                "<tr><td><b>Telefono: </b></td><td>" + cliente.getTelefono() + "</td></tr>" +
                "<tr><td><b>Correo: </b></td><td>" + cliente.getCorreo() + "</td></tr>" +
                "<tr><td><b>Dirección: </b></td><td>" + cliente.getDireccion() + "</td></tr>";

        codigoHTML += "</table>";

        return codigoHTML;

    }

    public static String DevolverHTMALCabecera() {
        String codigoHTML = "";
        codigoHTML = "<h1>Empresa</h1>" +
                "<h4>Ruc: 1804761551</h4>" +
                "<h4>Numero: 123143</h4>" +
                "<h4>Fecha: " + LocalDate.now() + "</h4>";
        return codigoHTML;

    }

    public static String generarComprobanteGeneral(Cliente cliente, LinkedList<DetalleFactura> listaFactura) {
        String codigoHTML = "";
        codigoHTML += "<!DOCTYPE html>";
        codigoHTML += "<html lang=\"en\">";
        codigoHTML += "<head>";
        codigoHTML += "<meta charset=\"UTF-8\">";
        codigoHTML += "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">";
        codigoHTML += " <title>Document</title>";
        codigoHTML += " </head>";
        codigoHTML += " <body>";
        codigoHTML += DevolverHTMALCabecera();
        codigoHTML += generarClienteHTML(cliente);
        codigoHTML += generarHTMLlistDetalleFactura(listaFactura);
        codigoHTML += " /<body>";
        codigoHTML += "</html>";

        return codigoHTML;

    }
    public class HtmlToPdfOpenPDF {
    public static void main(String[] args) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream("ConvertedHtmlToPdf.pdf"));
            document.open();
            String htmlContent = "<html><head><title>Sample HTML</title></head><body><h1>Hello, OpenPDF!</h1><p>This is a paragraph in the generated PDF.</p></body></html>";
            HTMLWorker htmlWorker = new HTMLWorker(document);
            htmlWorker.parse(new StringReader(htmlContent));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            document.close();
        }
        System.out.println("PDF created successfully.");
    }
}



    public static void main(String[] args) throws Exception {

        Cliente cliente1 = new Cliente("1804764551", "sebaspico@outlook.com", "Totoras", "Sebastian Pico",
                "0961390722");

        LinkedList<DetalleFactura> listaFactura = new LinkedList<>();
        listaFactura.add(new DetalleFactura(1, 500, "CPU", 500));
        listaFactura.add(new DetalleFactura(21, 200, "Monitor", 400));
        listaFactura.add(new DetalleFactura(1, 150, "Set GAMER", 150));
        listaFactura.add(new DetalleFactura(3, 200, "HEADSET", 600));

       /* // Imprimir HTML Cliente
        System.out.println(generarClienteHTML(cliente1));
        System.out.println();

        // Imprimir HTML Detalle Factura
        System.out.println(generarHTMLlistDetalleFactura(listaFactura));*/

        System.out.println(generarComprobanteGeneral(cliente1, listaFactura));

    }
}
