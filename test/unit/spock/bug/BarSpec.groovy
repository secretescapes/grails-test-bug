package spock.bug

import grails.test.mixin.TestFor
import grails.test.runtime.FreshRuntime
import org.springframework.context.i18n.LocaleContextHolder
import spock.lang.Specification
import spock.util.mop.ConfineMetaClassChanges


@ConfineMetaClassChanges([LocaleContextHolder])
@TestFor(BarTagLib)
@FreshRuntime
class BarSpec extends Specification {


    def 'bar' () {
        given:
            LocaleContextHolder.metaClass.static.setLocale = { Locale locale ->

            }
		expect:
			true
    }

}
