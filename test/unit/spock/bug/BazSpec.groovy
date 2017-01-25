package spock.bug

import org.springframework.context.i18n.LocaleContextHolder
import spock.lang.Specification
import spock.util.mop.ConfineMetaClassChanges

@ConfineMetaClassChanges([LocaleContextHolder])
class BazSpec extends Specification {

    def 'baz'() {
        given:
			LocaleContextHolder.locale = Locale.UK
        expect:
			Locale.UK == LocaleContextHolder.locale
    }
}
