package org.ldv.todoapp.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UtilisateursController {

    @GetMapping("admin/utilisateurs")
    fun mesutilisateurs(): String {
        return "admin/utilisateurs"
    }
}
