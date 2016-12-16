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

package com.venaglia.roger.ui.sim;

import com.google.inject.Inject;
import com.google.inject.name.Named;

/**
 * Created by ed on 9/1/16.
 */
public abstract class VirtualHardButton extends VirtualButton {

    VirtualHardButton(float scale, ButtonClass buttonClass) {
        super(null, scale, buttonClass);
    }

    public static class Left extends VirtualHardButton {

        @Inject
        public Left(@Named("UIScale") float scale) {
            super(scale, ButtonClass.LEFT_BUMPER);
        }
    }

    public static class Right extends VirtualHardButton {

        @Inject
        public Right(@Named("UIScale") float scale) {
            super(scale, ButtonClass.RIGHT_BUMPER);
        }
    }

    public static class Top extends VirtualHardButton {

        @Inject
        public Top(@Named("UIScale") float scale) {
            super(scale, ButtonClass.TOP_BUMPER);
        }
    }
}
