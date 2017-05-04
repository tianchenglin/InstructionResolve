/*
 * Copyright (c) Created by T C L on 2017.5.3.
 */

package com.tcl.study.instructionsresolvelibrary.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeUtil {

  /**
   * 把毫秒转化成日期
   */

  public static String transferLongToDate(Long millSec) {
    SimpleDateFormat sdf = new SimpleDateFormat("MM-dd");
    Date date = new Date(millSec);
    return sdf.format(date);
  }
}
