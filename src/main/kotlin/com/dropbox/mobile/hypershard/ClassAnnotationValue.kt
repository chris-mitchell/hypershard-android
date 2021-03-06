package com.dropbox.mobile.hypershard

/**
 * Annotation name for Kotlin or Java classes
 *
 */
sealed class ClassAnnotationValue {
    data class Present(val annotationName: String) : ClassAnnotationValue()
    object Empty : ClassAnnotationValue()
}
