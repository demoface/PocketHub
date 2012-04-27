package com.github.mobile.ui.gist;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mobile.R.id;
import com.github.mobile.ui.ItemView;
import com.github.mobile.util.TypefaceUtils;

import org.eclipse.egit.github.core.Gist;

/**
 * View of a {@link Gist} in a list
 */
public class GistView extends ItemView {

    /**
     * Gist id text view
     */
    public final TextView gistId;

    /**
     * Gist title text view
     */
    public final TextView title;

    /**
     * Gist author text view
     */
    public final TextView author;

    /**
     * Created date text view
     */
    public final TextView created;

    /**
     * Number of comments text view
     */
    public final TextView comments;

    /**
     * Number of files text view
     */
    public final TextView files;

    /**
     * Avatar image view
     */
    public final ImageView avatar;

    /**
     * Create view of a {@link Gist} in a list
     *
     * @param view
     */
    public GistView(View view) {
        super(view);

        gistId = (TextView) view.findViewById(id.tv_gist_id);
        title = (TextView) view.findViewById(id.tv_gist_title);
        author = (TextView) view.findViewById(id.tv_gist_author);
        created = (TextView) view.findViewById(id.tv_gist_creation);
        comments = (TextView) view.findViewById(id.tv_gist_comments);
        files = (TextView) view.findViewById(id.tv_gist_files);
        avatar = (ImageView) view.findViewById(id.iv_gravatar);

        TypefaceUtils.setOctocons((TextView) view.findViewById(id.tv_comment_icon),
                (TextView) view.findViewById(id.tv_file_icon));
    }
}