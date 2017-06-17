/*
 * This file is part of Butter.
 *
 * Butter is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Butter is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Butter. If not, see <http://www.gnu.org/licenses/>.
 */

package butter.droid.provider;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import butter.droid.provider.base.ItemsWrapper;
import butter.droid.provider.base.Media;
import butter.droid.provider.base.filter.Filter;
import butter.droid.provider.base.filter.Genre;
import butter.droid.provider.base.filter.Sorter;
import butter.droid.provider.base.nav.NavItem;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.List;

public interface MediaProvider {

    @NonNull Single<ItemsWrapper> items(@Nullable Filter filter);

    @NonNull Single<Media> detail(Media media);

    /**
     * @return List of supported Sorters for this provider.
     */
    @NonNull Maybe<List<Sorter>> sorters();

    /**
     * @return List of supported Genres for this provider.
     */
    @NonNull Maybe<List<Genre>> genres();

    @NonNull Maybe<List<NavItem>> navigation();

}
