/*
 * This file is part of OpenJSIP project.
 *
 * OpenJSIP is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version
 * OpenJSIP is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 * Copyright (c) 2013 - Ievgen Krapyva
 */

package openjsip.locationservice

import javax.sip.header.ContactHeader

/**
 * @param key Key to location service database of corresponding subscriber
 * @param contactHeader Contact header that represents the current location of subscriber
 * @param callId Call-ID value of REGISTER request
 * @param cseq CSeq value of REGISTER request
 * @param expiresTimeSec Time in seconds when this binding will expire.
 */
class Binding(val key: String, val contactHeader: ContactHeader, val callId: String, val cseq: Long, expiresTimeSec: Long) {

  expiresTime = expiresTimeSec.toInt

  /**
   * @return The remaining lifetime of binding in seconds.
   */
  def expiresTime = contactHeader.getExpires

  def expiresTime_=(x: Int) {
    contactHeader.setExpires(x)
  }

  override def toString = {
    contactHeader.toString.trim()
  }
}