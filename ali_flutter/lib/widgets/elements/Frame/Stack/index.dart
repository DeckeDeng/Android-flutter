import 'package:flutter/material.dart';

import 'package:ali_flutter/model/widget.dart';
import './Stack/index.dart' as Stack;
import './IndexedStack/index.dart' as IndexedStack;

List<WidgetPoint> widgetPoints = [
  WidgetPoint(
    name: 'Stack',
    routerName: Stack.Demo.routeName,
    buildRouter: (BuildContext context) => Stack.Demo(),
  ),
  WidgetPoint(
    name: 'IndexedStack',
    routerName: IndexedStack.Demo.routeName,
    buildRouter: (BuildContext context) => IndexedStack.Demo(),
  ),
];
