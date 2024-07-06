class ImageDownloader {
    fun loadFromServer() {}
}

class ImageView {
    fun drawToScreen() {}
}

class ImageTransformer {
    fun cropByShape() {}
}

class ImageCacheManager {
    fun saveCache() {}
    fun loadCache() {}
}

interface ImageFacade {
    fun showImage(
        imageDownloader: ImageDownloader,
        imageView: ImageView,
        imageTransformer: ImageTransformer,
        imageCacheManager: ImageCacheManager
    ) {
        imageCacheManager.loadCache()
        imageDownloader.loadFromServer()
        loadCache()

    }
}
