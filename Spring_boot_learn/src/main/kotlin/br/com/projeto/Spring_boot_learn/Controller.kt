package br.com.projeto.Spring_boot_learn

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong


@RestController
class Controller {
    val counter: AtomicLong = AtomicLong()

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value = "name", defaultValue = "Word") name: String):Greeting{
        return Greeting(counter.incrementAndGet(), "Hello, $name!")
    }
}