package ets;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.sax.SAXSource;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;

public class XMLInputStream {

	@POST
	@Consumes("application/xml")
	public StreamSource postDocument(StreamSource incomingXML) {
		return transform(incomingXML);
	}

	private StreamSource transform(StreamSource incomingXML) {
		// TODO Auto-generated method stub
		return null;
	}

	@POST
	@Consumes("application/xml")
	public Document postDocument(Document incomingXML)
			throws TransformerException {
		return transform(incomingXML);
	}

	private Document transform(Document incomingXML) {
		// TODO Auto-generated method stub
		return null;
	}

	@POST
	@Consumes("application/xml")
	public DOMSource postDOMSource(DOMSource incomingXML)
			throws TransformerException {
		return transform(incomingXML);
	}

	private DOMSource transform(DOMSource incomingXML) {
		// TODO Auto-generated method stub
		return null;
	}

	@POST
	@Consumes("application/xml")
	public SAXSource postSAXSource(SAXSource incomingXML) {
		return transform(incomingXML);
	}

	private SAXSource transform(SAXSource incomingXML) {
		// TODO Auto-generated method stub
		return null;
	}
}
