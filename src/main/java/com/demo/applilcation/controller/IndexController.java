package com.demo.applilcation.controller;

import com.demo.applilcation.view.IndexView;
import com.demo.framework.controller.ControllerMapping;
import com.demo.framework.controller.IController;
import com.demo.framework.ds.ModelAndView;
import com.demo.framework.model.SimpleModel;
import jakarta.servlet.http.HttpServletRequest;

import java.awt.image.SampleModel;
@ControllerMapping(value="/")
public class IndexController implements IController {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request) {
        return new ModelAndView(new SimpleModel(),new IndexView());
    }
}
