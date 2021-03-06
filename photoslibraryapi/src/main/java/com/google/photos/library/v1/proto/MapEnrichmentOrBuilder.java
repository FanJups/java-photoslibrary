// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/photos/library/v1/photos_library.proto

package com.google.photos.library.v1.proto;

public interface MapEnrichmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.photos.library.v1.MapEnrichment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Origin location for this enrichment item.
   * </pre>
   *
   * <code>.google.photos.library.v1.Location origin = 1;</code>
   *
   * @return Whether the origin field is set.
   */
  boolean hasOrigin();
  /**
   *
   *
   * <pre>
   * Origin location for this enrichment item.
   * </pre>
   *
   * <code>.google.photos.library.v1.Location origin = 1;</code>
   *
   * @return The origin.
   */
  com.google.photos.library.v1.proto.Location getOrigin();
  /**
   *
   *
   * <pre>
   * Origin location for this enrichment item.
   * </pre>
   *
   * <code>.google.photos.library.v1.Location origin = 1;</code>
   */
  com.google.photos.library.v1.proto.LocationOrBuilder getOriginOrBuilder();

  /**
   *
   *
   * <pre>
   * Destination location for this enrichemt item.
   * </pre>
   *
   * <code>.google.photos.library.v1.Location destination = 2;</code>
   *
   * @return Whether the destination field is set.
   */
  boolean hasDestination();
  /**
   *
   *
   * <pre>
   * Destination location for this enrichemt item.
   * </pre>
   *
   * <code>.google.photos.library.v1.Location destination = 2;</code>
   *
   * @return The destination.
   */
  com.google.photos.library.v1.proto.Location getDestination();
  /**
   *
   *
   * <pre>
   * Destination location for this enrichemt item.
   * </pre>
   *
   * <code>.google.photos.library.v1.Location destination = 2;</code>
   */
  com.google.photos.library.v1.proto.LocationOrBuilder getDestinationOrBuilder();
}
