package eu.plumbr.ebdc

import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.web.SpringBootServletInitializer

class ServletInitializer extends SpringBootServletInitializer {

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    application.sources(EbdcApplication)
  }

}
