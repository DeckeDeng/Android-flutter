import 'package:flutter/material.dart';

import 'package:ali_flutter/model/widget.dart';
import './Align/index.dart' as Align;

List<WidgetPoint> widgetPoints = [
  WidgetPoint(
    name: 'Align',
    routerName: Align.Demo.routeName,
    buildRouter: (BuildContext context) => Align.Demo(),
  ),
];