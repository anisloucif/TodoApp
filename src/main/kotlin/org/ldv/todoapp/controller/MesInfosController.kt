package org.ldv.todoapp.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class MesInfosController {

    @GetMapping("mes-infos")
    fun mesinfos(): String {
        return "mes-infos"
    }
}
