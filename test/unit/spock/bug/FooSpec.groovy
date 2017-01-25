package spock.bug

import org.springframework.context.i18n.LocaleContextHolder
import spock.lang.Specification
import spock.util.mop.ConfineMetaClassChanges

@ConfineMetaClassChanges(LocaleContextHolder)
class FooSpec extends Specification {

	def 'foo'() {
		given:
			LocaleContextHolder.metaClass.static.getLocale = { Locale.UK }
		expect:
			true
	}
}
