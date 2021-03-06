/*
 * Copyright (C) 2012  Krawler Information Systems Pvt Ltd
 * All rights reserved.
 * 
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
*/
package com.krawler.spring.exportFunctionality;

import java.util.HashMap;

import com.krawler.common.service.ServiceException;
import com.krawler.spring.common.KwlReturnObject;

/**
 * @author Johnson
 *
 */
public interface ExportPdfTemplateService
{
    /**
     * @param requestParams
     * @return
     * @throws ServiceException
     */
    public KwlReturnObject saveReportTemplate(HashMap<String, Object> requestParams) throws ServiceException;
    
    /**
     * @param tempid
     * @return
     * @throws ServiceException
     */
    public KwlReturnObject deleteReportTemplate(String tempid) throws ServiceException;
    
    /**
     * @param requestParams
     * @return
     * @throws ServiceException
     */
    public KwlReturnObject editReportTemplate(HashMap<String, Object> requestParams) throws ServiceException;

    /**
     * @param userid
     * @return
     * @throws ServiceException 
     */
    public KwlReturnObject getAllReportTemplate(String userid, int templatetype) throws ServiceException;
}
