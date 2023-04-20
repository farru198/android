/*
 *
 * Nextcloud Android client application
 *
 * @author Tobias Kaminsky
 * Copyright (C) 2023 Tobias Kaminsky
 * Copyright (C) 2023 Nextcloud GmbH
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */

package com.owncloud.android.app_review

import androidx.appcompat.app.AppCompatActivity
import com.nextcloud.app_review.InAppReviewHelper
import com.nextcloud.client.preferences.AppPreferences

class InAppReviewHelperImpl(appPreferences: AppPreferences) :
    InAppReviewHelper {
    override fun resetAndIncrementAppRestartCounter() {
    }

    override fun showInAppReview(activity: AppCompatActivity) {
    }
}
