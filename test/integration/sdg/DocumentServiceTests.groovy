package sdg

import com.novatec.sdg.AuthService
import com.novatec.sdg.DocumentService
import com.novatec.services.documentservice.Document
import com.novatec.services.documentservice.Version
import griffon.test.GriffonUnitTestCase
import org.junit.Ignore
import org.junit.Test

class DocumentServiceTests extends GriffonUnitTestCase {
    GriffonApplication app
    DocumentService service = new DocumentService()
    AuthService aut = new AuthService()
    def token

    protected void setUp() {
        super.setUp()
        token = aut.login("webservices", 'webservices')
    }

    protected void tearDown() {
        super.tearDown()
        aut.logout(token)
    }

    @Ignore
    @Test
    void testCreateFile() {
        File a = new File("c:/TJAVA.pdf")
        def bytes = a.getBytes()
        Document doc = new Document()
        doc.path = "/okm:personal/webservices/TJAVA.pdf"
        service.createDocument(token, doc, bytes)
    }

    @Ignore
    @Test
    void testCheckin() {
        File a = new File("c:/TJAVA.pdf")
        service.checkinDocument(token, "/okm:personal/webservices/Imagenes/${a.name}", "si o que")
    }

    @Test
    void testVersionHistory() {
        List<Version> lista = service.getVersionHistory(token, "/okm:personal/webservices/Documentos/JAVA.pdf")
        lista.each {println "es actual:${it.actual} comentario:${it.comment} fecha_de_creacion:${it.created} tamano:${it.size}, nombre:${it.name}"}
    }
}
