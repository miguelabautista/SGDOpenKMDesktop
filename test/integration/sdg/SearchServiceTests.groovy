package sdg

import com.novatec.sdg.AuthService
import com.novatec.sdg.SearchService
import griffon.test.GriffonUnitTestCase

class SearchServiceTests extends GriffonUnitTestCase {
    GriffonApplication app
    SearchService service = new SearchService()
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

    void testFindByName() {
        def lista = service.findByName(token, "caracas.pg")

        assertEquals(0, lista.size())
    }
}
