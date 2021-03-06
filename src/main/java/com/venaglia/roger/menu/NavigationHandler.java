/*
 * Copyright 2016 - 2017 Ed Venaglia
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 *
 */

package com.venaglia.roger.menu;

import com.google.inject.Inject;
import com.google.inject.Singleton;

/**
 * Created by ed on 9/8/16.
 */
@Singleton
public class NavigationHandler {

    public static final String NAV_PREFIX = "nav:";

    public void handleDo(String actionDo) {
        if (actionDo.startsWith(NAV_PREFIX)) {
            menuTree.navigate(actionDo.substring(4));
        }
    }

    @Inject
    private MenuTree menuTree;
}
