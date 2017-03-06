/*
 * Copyright 2016 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.firebase.ui.auth.ui.email.fieldvalidators;

import android.support.design.widget.TextInputLayout;

import com.firebase.ui.auth.R;

public class PasswordFieldValidator extends BaseValidator {
    private int mMinLength;
    private Boolean mIsValid = false;


    public PasswordFieldValidator(TextInputLayout errorContainer, int minLength) {
        super(errorContainer);
        mMinLength = minLength;
        mErrorMessage = mErrorContainer.getResources()
                .getQuantityString(R.plurals.error_weak_password, mMinLength, mMinLength);
    }

    @Override
    protected boolean isValid(CharSequence charSequence) {
        mIsValid = charSequence.length() >= mMinLength;
        return mIsValid;
    }

    public boolean isValid() {
        return mIsValid;
    }
}
