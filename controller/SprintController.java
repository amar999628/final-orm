package com.pennant.prodmtr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pennant.prodmtr.service.Interface.SprintService;

@Controller
public class SprintController {

	@Autowired
	private SprintService sprintService;
}
